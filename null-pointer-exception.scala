/* Scala AnyVals cannot be Null */
def f(x: Int) = x + 1
def g(x: Int) = if (x == 0) 0 else null
f(0)
g(0)

// static type error
// f(g(0))

/* Scala AnyVars (most classes) can be Null */

class C(val x: Int)

def h(o_? : Option[C]) : Option[Int] = for {o <- o_?} yield o.x
h(Some(new C(0))) // Some(0)
h(None) // None

// dynamic null exception
// f(null)
