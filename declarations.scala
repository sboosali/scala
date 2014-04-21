abstract class A {
  var x: Int = _  // default value
  var y = 1       // specific value   
  var z: Int      // abstract variable

  def f = x + y + z
}

class B extends A { var z = 2 } // concrete class

println(new B().f)
