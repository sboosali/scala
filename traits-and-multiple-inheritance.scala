// scala trait with only abstract members =bytcode= java interface

trait X {
  def f = "x"
}

trait Y {
  /* def f = 1 // error: type mismatch */
  def f = "y" // methods with same input-type must share same output-type with all mixed-in sibling-methods
}

// a class C may extend one superclass S and mixin any number of traits T1 T2 ...

/* class C extends X with Y // error: class C inherits conflicting members */

class Z extends X with Y {
  override def f = super[X].f // must explicitly override conflicts
  def g = super.f // = super[Y] (super defaults to last trait)
}

val z = new Z
println(z.f)
println(z.g)

