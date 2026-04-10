palavrasFrequentes :: [String] -> [String]
palavrasFrequentes xs = take 3 (map (\(w,i,j) -> w) (sort [(w, count w xs, index w xs 0) | w <- unique xs]))

unique :: [String] -> [String]
unique [] = []
unique (x:xs) = x : unique [y | y <- xs, y /= x]

count :: String -> [String] -> Int
count i [] = 0
count w (x:xs)
    | w == x = 1 + count w xs
    | otherwise = count w xs

index :: String -> [String] -> Int -> Int
index w [] i = i
index w (x:xs) i
    | w == x = i
    | otherwise = index w xs (i+1)

sort :: [(String, Int, Int)] -> [(String, Int, Int)]
sort [] = []
sort (x:xs) =
    sort [y | y <- xs, better y x] ++ [x] ++ sort [y | y <- xs, not (better y x) && not (equal y x)]
    where
        better (w1,c1,i) (w2,c2,j)
            | c1 > c2 = True
            | c1 < c2 = False
            | otherwise = let len1 = length w1; len2 = length w2 in if len1 /= len2 then len1 < len2 else w1 < w2

        equal (w1,c1,i) (w2,c2,j) = c1 == c2 && w1 == w2