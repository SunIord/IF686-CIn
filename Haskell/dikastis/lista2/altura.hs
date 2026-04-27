data Tree t = Node t (Tree t) (Tree t) 
  | Nilt
  deriving (Read)
  
alturaArvore :: Tree t -> Int
alturaArvore Nilt = 0
alturaArvore (Node i left right) = 1 + max (alturaArvore left) (alturaArvore right)