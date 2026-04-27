merge :: [Int] -> [Int] -> [Int]
merge xs [] = xs
merge [] ys = ys
merge (x:xs) (y:ys)
  | x <= y    = x : merge xs (y:ys)
  | otherwise = y : merge (x:xs) ys

mergesort :: [Int] -> [Int]
mergesort [] = []
mergesort [x] = [x]
mergesort xs = merge (mergesort left) (mergesort right)
    where
        (left, right) = split xs

split :: [Int] -> ([Int], [Int])
split [] = ([], [])
split [x] = ([x], [])
split (x:y:xs) = (x:xs1, y:xs2)
    where
        (xs1, xs2) = split xs