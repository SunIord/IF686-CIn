data Expr = Lit Int       
    | Add Expr Expr 
    | Sub Expr Expr
    deriving Show

showExpr :: Expr -> String
showExpr (Lit n) = show n
showExpr (Add a b) = "(" ++ showExpr a ++ " + " ++ showExpr b ++ ")"
showExpr (Sub a b) = "(" ++ showExpr a ++ " - " ++ showExpr b ++ ")"

data List t = Nil | Cons t (List t) 
    deriving Show

toList :: List t -> [t]
toList Nil = []
toList (Cons x xs) = x : toList xs

fromList :: [t] -> List t
fromList [] = Nil
fromList (x:xs) = Cons x (fromList xs)

data Tree t = Leaf | Node t (Tree t) (Tree t)
    deriving Show

depth :: Tree t -> Int
depth Leaf = 0
depth (Node i l r) = 1 + max (depth l) (depth r)

collapse :: Tree t -> [t]
collapse Leaf = []
collapse (Node x l r) = collapse l ++ [x] ++ collapse r

mapTree :: (t -> u) -> Tree t -> Tree u
mapTree f Leaf = Leaf
mapTree f (Node x l r) = Node (f x) (mapTree f l) (mapTree f r)