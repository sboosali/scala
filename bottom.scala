def f(x: Int) = ???
def g(x: Int) = f(x)
// compiles
/* f(1) */ // fails at runtime
