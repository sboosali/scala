val text  : String       = io.Source.fromFile("files.scala").mkString
val lines : Iterator[String] = io.Source.fromFile("files.scala").getLines

for {line <- lines} println(line)
