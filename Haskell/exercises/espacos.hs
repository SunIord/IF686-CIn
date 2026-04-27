addEspacos :: Int -> String
addEspacos 0 = ""
addEspacos n = " " ++ addEspacos(n-1)

paraDireita :: Int -> String -> String
paraDireita n s = addEspacos n ++ s

-- ghci
-- :l espacos.hs