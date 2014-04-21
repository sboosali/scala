// scala method ≠ scala function

// functions
val placeheld: (Int, Int) => Int = _ + _
val named: (Int, Int) => Int = ((x, y) => x + y)
val typed = ((x: Int, y: Int) => x + y : Int)

// method
def add(x: Int, y: Int): Int = x + y
