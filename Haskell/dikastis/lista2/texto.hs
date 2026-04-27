data Cmd = Cursor Int
         | Backspace Int
         | Delete Int
         | Insert String
         deriving (Read)

editText :: String -> [Cmd] -> String
editText initial cmds = go initial 0 cmds
  where
    go str pos [] = str
    go str pos (cmd:rest) = case cmd of
        Cursor x -> let newPos = pos + x
                    in go str newPos rest
        Backspace x ->  let (before, after) = splitAt pos str
                            keep = length before - min x pos
                            newBefore = take keep before
                            newStr = newBefore ++ after
                            newPos = pos - min x pos
                        in go newStr newPos rest
        Delete x -> let (before, after) = splitAt pos str
                        after' = drop x after
                        newStr = before ++ after'
                    in go newStr pos rest
        Insert s -> let (before, after) = splitAt pos str
                        newStr = before ++ s ++ after
                    in go newStr pos rest