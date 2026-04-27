suaviza :: [Float] -> [Float]
suaviza [] = []
suaviza [x] = [x]
suaviza xs = [head xs] ++ mid xs ++ [last xs]

mid :: [Float] -> [Float]
mid (x:y:z:rest) = avg x y z : mid (y:z:rest)
mid i = []

avg :: Float -> Float -> Float -> Float
avg a b c = (a + b + c) / 3