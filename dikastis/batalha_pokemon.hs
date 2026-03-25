battle :: Int -> String
battle n
  | ((n `div` 100 + n `mod` 100) ^ 2) == n = "Charmander vitorioso"
  | otherwise = "Charmander derrotado"