

import scala.math._



case class Complex(re: Double, im: Double) extends Ordered[Complex] {

  private val modulus = sqrt(pow(re,2) + pow(im,2))
  def this(re:Double) = this(re,0)
  def unary_+ = this
  def unary_- = new Complex(-re, -im)
  def unary_~ = new Complex(re, -im)
  def unary_! = modulus

  def compare(that: Complex) = !this compare !that


  def +(c: Complex) = new Complex(re+c.re, im + c.im)
  def -(c: Complex) = this + -c
  def * (c: Complex) = new Complex(re * c.re - im * c.im, im * c.re + re* c.im)
  def / (c: Complex) = {
    require(c.re != 0 || c.im != 0)
    val d = pow(c.re, 2) + pow(c.im, 2)
    new Complex((re*c.re+ im*c.im)/d, (im*c.re-re*c.im)/d)
  }

  implicit def fromDouble(d: Double) = new Complex(d)

  override def toString =
    this match {

      case Complex.i => "i"
      case Complex(re, 0) => re.toString
      case Complex(0,im) => im.toString + "*i"
      case _=> asString
    }
  private def asString =
    re + (if(im < 0) "-" + -im else "+" + im ) + "*i"
}

object Complex {

  val i = new Complex(0,1)

  def apply(re:Double) = new Complex(re)


  implicit  def fromDouble(d:Double) = new Complex(d)
  implicit def fromFloat(f:Float) = new Complex(f)
  implicit def fromLong(l:Long) = new Complex(l)
  implicit  def fromInt(i:Int) = new Complex(i)
  implicit def fromShort(s: Short) = new Complex(s)


}
