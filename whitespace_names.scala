def `method with whitespace`(phrase: String) = phrase split " "
// method$u0020with$u0020whitespace: (phrase: String)Array[String]

val words = `method with whitespace`("method with whitespace")

for {word <- words} print(f"$word ")
