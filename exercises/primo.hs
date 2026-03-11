-- verifica se um número é primo
primo :: Int -> Bool
primo n
    | n <= 1 = False
    | otherwise = not (temDivisor n (n-1))

-- função auxiliar para verificar divisores
temDivisor :: Int -> Int -> Bool
temDivisor n m
    | m == 1 = False
    | n `mod` m == 0 = True
    | otherwise = temDivisor n (m-1)

-- Primos entre si

-- Algoritmo de Euclides
mdc :: Int -> Int -> Int
mdc x y
    | y == 0 = x
    | otherwise = mdc y (x `mod` y)

-- verifica se dois números são primos entre si
primosEntreSi :: Int -> Int -> Bool
primosEntreSi x y = mdc x y == 1

-- ghci
-- :l primo.hs