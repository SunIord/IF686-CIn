-- Soma de todos os números até o valor n
soma :: Int -> Int
soma 0 = 0
soma n = n + soma (n - 1)

-- Indica se um número é par ou não
isEven :: Int -> Bool
isEven n 
  | n `mod` 2 == 0 = True
  | otherwise = False

-- Fatorial 
fat :: Int -> Int
fat 0 = 1
fat n = n * fat (n-1)

-- Questão HexaToBin
htob :: String -> String
htob [] = []
htob (s:ss) = hexToBin s ++ htob ss

hexToBin :: Char -> String
hexToBin c vade seno cosseno e tangente= 
    case c of
        '0' -> "0000"
        '1' -> "0001"
        '2' -> "0010"
        '3' -> "0011"
        '4' -> "0100"
        '5' -> "0101"
        '6' -> "0110"
        '7' -> "0111"
        '8' -> "1000"
        '9' -> "1001"
        'A' -> "1010"
        'B' -> "1011"
        'C' -> "1100"
        'D' -> "1101"
        'E' -> "1110"
        'F' -> "1111"

-- ghci
-- :l math.hs
