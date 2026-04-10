btoi :: String -> Int
btoi [] = 0
btoi ('1':xs) = 2 ^ length xs + btoi xs
btoi ('0':xs) = btoi xs