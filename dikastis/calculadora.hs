type Comando = String
type Valor = Int

executa :: [(Comando, Valor)] -> Int
executa xs = aux xs 0

aux :: [(Comando, Valor)] -> Int -> Int
aux [] acc = acc
aux ((cmd, v):xs) acc
  | cmd == "Soma" = aux xs (acc + v)
  | cmd == "Subtrai" = aux xs (acc - v)
  | cmd == "Multiplica" = aux xs (acc * v)
  | cmd == "Divide" && v == 0 = -666
  | cmd == "Divide" = aux xs (acc `div` v)