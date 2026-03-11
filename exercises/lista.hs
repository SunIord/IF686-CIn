-- dobrar os elementos de uma lista
double :: [Int] -> [Int]
double [] = []
double (x:xs) = (2*x) : double xs

-- membership: se um elemento está na lista
member :: [Int] -> Int -> Bool
member [] n = False
member (x:xs) n
    | x == n = True
    | otherwise = member xs n

-- filtragem: apenas os números de uma string
digits :: String -> String
digits [] = []
digits (x:xs)
    | x >= '0' && x <= '9' = x : digits xs
    | otherwise = digits xs

-- soma de uma lista de pares
sumPairs :: [(Int,Int)] -> [Int]
sumPairs [] = []
sumPairs ((x,y):xs) = (x + y) : sumPairs xs