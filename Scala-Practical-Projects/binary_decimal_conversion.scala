
/*
This Scala program converts from a Binary Number to a Decimal as well as from a Decimal to a Binary Number.
*/


// There is a built in function in Scala, in std lib

def main(args: Array[String]): Unit = {
   val num = 42
    println(num.toBinaryString)

}

/* Use the good stuff in Scala! Pattern Matching - The whole idea of being Functional!!! Brevity
   You can use tail recursion to optimize this further. */


  def convertDecimalToBinary(dec: Int): String = dec match {

    case 0|1 => s"$dec"
    case _ => s"${convertDecimalToBinary(dec/2)}${dec%2}"


  }

/* In Scala you can easily convert from hexadecimal to binary and vice-versa. If needed a string interpolator or
an "implicit class" can be used, for all conversions like Octal etc."
*/


  def convertBinaryToDecimal(bin: String): Int ={

    val x = Integer.parseInt(bin,2)
    return x


  }
