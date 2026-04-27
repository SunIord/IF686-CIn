ordenaLista :: [Int] -> [Int]
ordenaLista xs = qSort xs

qSort :: [Int] -> [Int]
qSort [] = []
qSort (x:xs) = qSort [y | y <- xs, y < x] ++ [x] ++ qSort [y | y <- xs, y >= x]

-- ghci
-- :l qSort.hs