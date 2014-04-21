class C {
  def apply() = "apply()"
}

val c = new C
println(c())
println(c.apply())
