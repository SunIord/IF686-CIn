-- eleva os itens ao quadrado
mapping :: [Int] -> [Int]
mapping xs = map (^2) xs

-- retorna a soma dos quadrados dos itens
folding :: [Int] -> Int
folding xs = foldr (\x acc -> x*x + acc) 0 xs

-- manter na lista todos os itens maiores que zero.
filtering :: [Int] -> [Int]
filtering xs = filter (> 0) xs

-- ghci
-- :l map.hs