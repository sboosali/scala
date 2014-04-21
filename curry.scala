def f(x: Int)(y: Int)(z: Int) = x + y + z
// underscore as partial application
val g = f(1)(2)(_) // what's the point then?
// apply
println(g(3))
