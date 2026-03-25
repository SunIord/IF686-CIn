logMes :: String -> String -> Double
logMes mes fatura = foldl (+) 0 (valoresMes mes (split ';' fatura))

valoresMes :: String -> [String] -> [Double]
valoresMes mes [] = []
valoresMes mes (dataField:typeField:valueField:rest)
    | contemMes mes dataField = read valueField : valoresMes mes rest
    | otherwise = valoresMes mes rest
valoresMes mes lista = []

contemMes :: String -> String -> Bool
contemMes mes text = take 3 (drop 3 text) == mes

split :: Char -> String -> [String]
split sep "" = [""]
split sep (x:xs)
    | x == sep  = "" : split sep xs
    | otherwise = (x : head (split sep xs)) : tail (split sep xs)