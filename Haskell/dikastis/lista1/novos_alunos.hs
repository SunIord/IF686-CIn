bSort :: [String] -> [String]
bSort [] = []
bSort xs
  | xs == order xs = xs
  | otherwise = bSort (order xs)
  
order :: [String] -> [String]
order [x] = [x]
order (x:y:xs)
  | x > y = y : order (x:xs)
  | otherwise = x : order (y:xs)