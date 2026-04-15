-- Questões 1 e 2
type Chave = [(Char,Char)]
letras :: [Char]
letras = ['A'..'Z']

-- Exemplo.: criaChave 3 -> [('A','D'), ('B','E'),...,('Z','C')] 
criaChave :: Int -> Chave
criaChave k = pares letras (desloca k letras)
    where
        pares :: [Char] -> [Char] -> Chave
        pares [] i = []
        pares i [] = []
        pares (x:xs) (y:ys) = (x,y) : pares xs ys

        desloca :: Int -> [Char] -> [Char]
        desloca 0 xs = xs
        desloca n (x:xs) = desloca (n-1) (xs ++ [x]) 


-- Exemplo.: crypt (criaChave 3) "A LIGEIRA RAPOSA" -> "D OLJHLUD UDSRVD"
crypt:: Chave -> String -> String
crypt i [] = []
crypt k (x:xs)
    | x == ' ' = ' ' : crypt k xs
    | otherwise = busca x k : crypt k xs
    where
        busca :: Char -> Chave -> Char
        busca c [] = c
        busca c ((a,b):ps)
            | c == a = b 
            | otherwise = busca c ps


-- Questões 3 e 4
data ChaveTree = Node Char Char ChaveTree ChaveTree | Leaf
    deriving (Show)

chaveParcial :: ChaveTree
chaveParcial = Node 'I' 'L' (Node 'A' 'D' Leaf(Node 'E' 'X' Leaf Leaf))
                            (Node 'L' 'O' Leaf Leaf)
ryptT chaveParcial "A LIGEIRA RAPOSA"
-- Exemplo.: cryptT chaveParcial "A LIGEIRA RAPOSA" -> "D OLGXLRD RDPOSD"
cryptT :: ChaveTree -> String -> String
cryptT i [] = []
cryptT tree (x:xs)
    | x == ' ' = ' ' : cryptT tree xs
    | otherwise = buscaT x tree : cryptT tree xs
    where
        buscaT :: Char -> ChaveTree -> Char
        buscaT c Leaf = c
        buscaT c (Node a b l r)
            | c == a = b
            | otherwise = let left = buscaT c l in if left /= c then left else buscaT c r 

-- Exemplo.: contaNos chaveParcial -> 4
contaNos :: ChaveTree -> Int
contaNos Leaf = 0
contaNos (Node i j l r) = 1 + contaNos l + contaNos r