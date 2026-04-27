data Tree t = Nilt |
              Node t (Tree t) (Tree t)
              deriving (Read)

maiorDiametro :: Ord t => Tree t -> Int
maiorDiametro arvore = snd (medeArvore arvore)

medeArvore :: Tree t -> (Int, Int)
medeArvore Nilt = (0, 0)
medeArvore (Node i esq dir) = 
    let (hEsq, dEsq) = medeArvore esq
        (hDir, dDir) = medeArvore dir
        altura = 1 + max hEsq hDir
        diametroViaRaiz = hEsq + hDir + 1
        maiorDiametro = max dEsq (max dDir diametroViaRaiz)
    in (altura, maiorDiametro)