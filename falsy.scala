import scala.language.implicitConversions
import scala.language.reflectiveCalls
implicit def truthyInt   (x: Int)                : Boolean = !(x == 0)
implicit def truthyString(x: String)             : Boolean = !(x == "")
implicit def truthyList  (x: List[_])            : Boolean = !(x.isEmpty)
implicit def truthyList  (x: Map[_,_])           : Boolean = !(x.isEmpty)
implicit def truthyVal   (x: Any)                : Boolean = true
implicit def truthyClass (x: {def bool: Boolean}): Boolean = x.bool

// no static type errors
// dynamic falsy values

if (0) {
  println("0 is truthy")
} else {
  println("0 is falsy")
}

if ("") {
  println("\"\" is truthy")
} else {
  println("\"\" is falsy")
}

if (List()) {
  println("List() is truthy")
} else {
  println("List() is falsy")
}

if (Map()) {
  println("Map() is truthy")
} else {
  println("Map() is falsy")
}

class Truthy {}

if (new Truthy) {
  println("Truthy() is truthy")
} else {
  println("Truthy() is falsy")
}

class Falsy { def bool = false }

if (new Falsy) {
  println("Falsy() is truthy")
} else {
  println("Falsy() is falsy")
}
