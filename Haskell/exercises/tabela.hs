cabecalho :: String
cabecalho = "Semana    Venda\n"

imprimeTabela :: Int -> IO()
imprimeTabela n = putStr (cabecalho
                    ++ imprimeSemanas n
                    ++ imprimeTotal n 
                    ++ imprimeMedia n                    
                    )

imprimeSemanas :: Int -> String
imprimeSemanas 0 = paraDireita 2 (show 0) ++ paraDireita 8 (show (vendas 0))
imprimeSemanas n = imprimeSemanas (n-1) ++ "\n" ++ paraDireita 2 (show n) ++ paraDireita 8 (show(vendas n))

imprimeTotal :: Int -> String
imprimeTotal n = "\nTotal      " ++ show (somaVendas n) ++ "\n"

imprimeMedia :: Int -> String
imprimeMedia n = "Media      " ++ show (fromIntegral (somaVendas n) / fromIntegral (n+1)) ++ "\n"

-- Funções definidas em outros módulos
vendas :: Int -> Int
vendas n | n == 0 = 12
    | n == 1 = 14
    | n == 2 = 15
    | otherwise = 0

somaVendas :: Int -> Int
somaVendas 0 = vendas 0
somaVendas n = vendas n + somaVendas (n-1) 

addEspacos :: Int -> String
addEspacos 0 = ""
addEspacos n = " " ++ addEspacos(n-1)

paraDireita :: Int -> String -> String
paraDireita n s = addEspacos n ++ s

-- ghci
-- :l tabela.hs