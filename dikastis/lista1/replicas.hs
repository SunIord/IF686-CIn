isReplica :: String -> Int -> Char -> Bool
isReplica [] 0 c = True
isReplica [] n c = False
isReplica s 0 c = False
isReplica (x:xs) n c
  | x == c = isReplica xs (n-1) c
  | otherwise = False