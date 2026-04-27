gradeToNum :: String -> Float
gradeToNum "A+" = 9.7
gradeToNum "A" = 9.3
gradeToNum "A-" = 9.0
gradeToNum "B+" = 8.7
gradeToNum "B" = 8.3
gradeToNum "B-" = 8.0
gradeToNum "C+" = 7.7
gradeToNum "C" = 7.3
gradeToNum "C-" = 7.0
gradeToNum "D+" = 6.7
gradeToNum "D" = 6.3
gradeToNum "D-" = 6.0
gradeToNum "F" = 5.9
gradeToNum _ = 0.0 

numToGrade :: Float -> String
numToGrade x
    | x >= 9.7 = "A+"
    | x >= 9.3 = "A"
    | x >= 9.0 = "A-"
    | x >= 8.7 = "B+"
    | x >= 8.3 = "B"
    | x >= 8.0 = "B-"
    | x >= 7.7 = "C+"
    | x >= 7.3 = "C"
    | x >= 7.0 = "C-"
    | x >= 6.7 = "D+"
    | x >= 6.3 = "D"
    | x >= 6.0 = "D-"
    | otherwise = "F"

avg :: [String] -> Float
avg [] = 0.0
avg notas = sum (map gradeToNum notas) / fromIntegral (length notas)

contagemNotas :: [String] -> [String] -> Int
contagemNotas notasJeff cortes = 
    let media = avg notasJeff
        notaFinal = numToGrade media
        valorFinal = gradeToNum notaFinal
        count = length [c | c <- cortes, gradeToNum c <= valorFinal]
    in count