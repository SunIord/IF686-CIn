isCrescent :: (Int -> Int) -> Int -> Bool
isCrescent f n
    | n < 0 = error "n deve ser >= 0"
    | n == 0 = True
    | otherwise = isCrescent f (n-1) && f (n-1) <= f n

-- ghci
-- :l crescente.hs