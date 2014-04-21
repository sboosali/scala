import scala.language.implicitConversions
/* open class = wrapper class + implicit conversion */

// wrapper class
class OpenString(str: String) {
  def openMethod = "Open Classes!"
}

// implicit conversion
implicit def openString(str: String) : OpenString = new OpenString(str)

println("Scala String".openMethod)
