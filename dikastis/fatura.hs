minMaxCartao :: String -> (Double, Double)
minMaxCartao s = (minimum (extract (split ';' s)), maximum (extract (split ';' s)))

extract :: [String] -> [Double]
extract [] = []
extract (a:b:c:rest) = read c : extract rest
extract list = []

split :: Char -> String -> [String]
split sep "" = [""]
split sep (x:xs)
    | x == sep  = "" : split sep xs
    | otherwise = (x : head (split sep xs)) : tail (split sep xs)