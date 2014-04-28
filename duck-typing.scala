class A(x: Int) { def +(y: Int) = x + y }
class B(x: Int) { def +(y: Int) = x + y }
def f(a: A) = a.+(1)
f(new A(2))
/* f(new B(2)) */ // type error)

import scala.language.reflectiveCalls

def g(addable: {def +(z: Int): Int}) = addable.+(z=1) // arg name can differ

println(g(new A(2)))
println(g(new B(2)))
