type Pessoa = String
type Livro = String
type BancoDados = [(Pessoa, Livro)]

baseExemplo :: BancoDados
baseExemplo = [
    ("Sergio","O Senhor dos Aneis"),
    ("Andre","Duna"),
    ("Fernando","Jonathan Strange & Mr. Norrell"), 
    ("Fernando","Duna")
    ]

-- Funções de consulta
livros :: BancoDados -> Pessoa -> [Livro]
livros [] y = []
livros ((pessoa, livro):xs) p
    | pessoa == p = livro : livros xs p
    | otherwise = livros xs p

emprestimos :: BancoDados -> Livro -> [Pessoa]
emprestimos [] y = []
emprestimos ((pessoa, livro):xs) l
    | livro == l = pessoa : emprestimos xs l
    | otherwise  = emprestimos xs l

emprestado :: BancoDados -> Livro -> Bool
emprestado [] y = False
emprestado ((y, livro):xs) l
    | livro == l = True
    | otherwise  = emprestado xs l

qtdEmprestimos :: BancoDados -> Pessoa -> Int
qtdEmprestimos [] y = 0
qtdEmprestimos ((pessoa, y):xs) p
    | pessoa == p = 1 + qtdEmprestimos xs p
    | otherwise = qtdEmprestimos xs p

-- Funções de atualização

emprestar :: BancoDados -> Pessoa -> Livro -> BancoDados
emprestar bd p l = (p,l) : bd

devolver :: BancoDados -> Pessoa -> Livro -> BancoDados
devolver [] x y = []
devolver ((pessoa,livro):xs) p l
    | pessoa == p && livro == l = devolver xs p l
    | otherwise = (pessoa,livro) : devolver xs p l

-- Funções redefinidas utilizando compreensão de listas
livros2 :: BancoDados -> Pessoa -> [Livro]
livros2 bd p = [livro | (pessoa, livro) <- bd, pessoa == p]

emprestimos2 :: BancoDados -> Livro -> [Pessoa]
emprestimos2 bd l = [pessoa | (pessoa, livro) <- bd, livro == l]

devolver2 :: BancoDados -> Pessoa -> Livro -> BancoDados
devolver2 bd p l = [(pessoa,livro) | (pessoa,livro) <- bd, (pessoa,livro) /= (p,l)]

-- ghci
-- :l banco.hs