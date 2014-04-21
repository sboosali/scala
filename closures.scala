// $ scala -Xprint:lambdalift closures.scala

def Counter = {
  var a = 0
  () => {a+=1; a}
}

val x = Counter
println(f"x() => ${x()}")
println(f"x() => ${x()}")
println

val y = Counter
println(f"y() => ${y()}")
println
