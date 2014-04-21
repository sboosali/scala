// sugar
class RichStream[A](tail: =>Stream[A]) {
  def ::(head: A) = Stream.cons(head, tail)
}
implicit def enrichStream[A](stream: =>Stream[A]) = new RichStream(stream)


def from(n: Int): Stream[Int] = {
  println(f"[stream] making $n")
  n :: from(n + 1)
}

val nats = from(1)
println
nats(3)
