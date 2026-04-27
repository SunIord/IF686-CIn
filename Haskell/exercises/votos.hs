winner :: [Int] -> Int
winner [x] = x
winner (x:xs)
  | count x (x:xs) > count (winner xs) (x:xs) = x
  | otherwise = winner xs
  
count :: Int -> [Int] -> Int
count x [] = 0
count n (x:xs)
  | n == x = 1 + count n xs
  | otherwise = count n xs

unicos :: [Int] -> [Int]
unicos [] = []
unicos (x:xs) = x : unicos (filter (/= x) xs)

-- Função contendo exemplo de lista
votos :: [Int]
votos = [1,2,1,9,99,9,8,2,2,9,1,7,0,1,8,8,8,8,7]