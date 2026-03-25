mul2 :: [Int] -> [Int] -> [Int]
mul2 [] [] = []
mul2 (x:xs) [] = 0 : mul2 xs [] -- Qualquer número multiplicado por 0 é 0
mul2 [] (y:ys) = 0: mul2 ys []
mul2 (x:xs) (y:ys) = (x * y) : mul2 xs ys