sumTo :: Int -> Int
sumTo 0 = 0
sumTo n = n + sumTo (n - 1)