-- Função Fatorial
fat:: Int -> Int
fat 0 = 1
fat n = n * fat (n-1)

-- Compara se quatro números são iguais
all4Equal :: Int -> Int -> Int -> Int -> Bool
all4Equal a b c d = allEqual a b && allEqual b c && allEqual c d

allEqual :: Int -> Int -> Bool
allEqual x y = x == y

-- Retorna quantos parâmetros são iguais
equalCount :: Int -> Int -> Int -> Int
equalCount x y z 
    | x == y && y == z = 3
    | x == y || x == z || y == z = 2 
    | otherwise = 0

-- ghci
-- :l fat.hs