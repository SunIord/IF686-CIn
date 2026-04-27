-- Função recebe o número da semana e retorna o valor das vendas
vendas :: Int -> Int
vendas n | n == 0 = 44
    | n == 1 = 99
    | n == 2 = 33
    | otherwise = 0

-- Função que conta quantas semanas de 0 até n tiveram vendas iguais a s
semanaComVendas :: Int -> Int -> Int
semanaComVendas s n
    | n < 0 = 0 
    -- Quando n é menor que 0, não há mais o que verificar
    
    | vendas n == s = 1 + semanaComVendas s (n-1) 
    -- Se as vendas de duas semanas forem iguais, soma 1 e continua a verificar  

    | otherwise = semanaComVendas s (n-1)
    -- Apenas continua verificando as semanas anteriores

-- ghci
-- :l vendas.hs