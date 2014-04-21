/*
its precedence ~> its first char
*^ has higher precedence than *+

its associativity ~> its last char
endswith ":" -> it : right-associative

startswith "unary_" -> : unary operator
*/

// src http://stackoverflow.com/questions/16644988/why-is-the-unary-prefix-needed-in-scala

import collection.mutable.Map

class C(var x: String = "x", var n: Int = 1) {
  var map = Map[String, Int]()

  def unary_!() = -n
  def apply(x: String) = map get x
  def update(x: String, n: Int) = map put (x, n)
  def +=(n: Int) = { this.n += n }
  def +(n: Int) = { var o = new C(this.x, this.n + n); o.map = this.map; o }
}

var o = new C

!o
// is sugar for
o.unary_!

o("x")
// is sugar for
o.apply("x")

o("x") = 1
// is sugar for
o.update("x", 1)

o += 1
// is sugar for
o.+=(1)
// may be sugar for
o = o.+(1)

