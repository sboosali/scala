// aka Type-Constructor Polymorphism
import scala.language.higherKinds

trait Functor[F[_]] {
  def fmap[A,B](functor: F[A], function: A => B) : F[B]
}

class Both[A](x: A, y: A) extends Functor[Both] {
  def fmap[A,B](p: Both[A], f: A => B) = new Both(f(x), f(y))
  override def toString = f"Both($x, $y)"
}

def inc: Int => Int = _ + 1
println((new Both(0,0)).fmap(new Both(1,2), inc))

