def f(x_? : Option[Int]) = for {x <- x_?} yield x + 1

def g(x_? : Option[Int]) = x_? map {_ + 1}

def h(x_? : Option[Int]) = x_? match {
  case Some(x) => Some(x + 1)
  case None => None
}

println(f(Some(0)))
println(f(None))
println

println(g(Some(0)))
println(g(None))
println

println(h(Some(0)))
println(h(None))
println
