// scala -language:postfixOps
import scala.language.postfixOps

def factorial(n: Int) : Int = n match {
  case 1 => 1
  case _ => n * factorial(n-1)
}

case class RichInt(n: Int) {
  def !() = new RichInt(factorial(n))
}
implicit def enrichInt(n: Int) = RichInt(n)

// postfix
println(f"5! = ${5!}")
println(f"1 + 5! = (1 + 5)! = ${1 + 5!}")

