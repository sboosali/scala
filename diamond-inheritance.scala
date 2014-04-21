trait A {
  def y = "y => a"
  def z = "z => a"
}

trait B extends A {
  def x          = "x => b"
  override def y = "y => b"
}

trait C extends A {
  def x          = "x => c"
  override def y = "y => c"
}

class D extends C with B {
  override def x = super[C].x // manually only disambiguate ambiguous method to C's
  // def y // automatically from last mixin i.e. B
  // def z // from A
}

val d = new D
println(d.x) // x => c
println(d.y) // y => b
println(d.z) // z => a

