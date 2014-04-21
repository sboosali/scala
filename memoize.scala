import collection.mutable.Map

def memoize[A,B](f: A=>B) = new Function1[A,B] {
  // mutable variable shared by all calls to same instance of function object
  var cache = Map[A,B]()

  // f(...) = f.apply(...)
  def apply(x: A) = {
    if (cache contains x) {
      cache(x)
    } else {
      val fx = f(x)
      cache += (x -> fx)
      fx
    }
  }
}

val fib: Int=>Int = memoize {
  case 0 => 0
  case 1 => 1
  case n => fib(n-1) + fib(n-2)
}

println(fib(1000)) // linear time
