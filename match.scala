// match variables startwith lowercase
import Math.PI
def which(n: Double) = n match {
  case PI => "PI"
  case pi => pi.toString
}
println
println(which(PI))
println(which(3.14))
