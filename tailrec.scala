import scala.annotation.tailrec
// scalac raises error if it cannot tail-call-optimize the the @tailrec-annotated method

// scalac cannot tail-call-optimize if
// 1. recursive call not in tail position
// 2. method could be overriden

/* fails

"error: could not optimize @tailrec annotated method length: it is neither private nor final so can be overridden"

class RichList(list: List[_]) {
 def length = _length(0)
 @tailrec private def _length(n: Int): Int = list match {  
   case Nil => n
   case head :: tail => new RichList(tail)._length(n+1)
 }
}

 */

/* succeeds */
class RichList(list: List[_]) {
 def length = _length(0)
 @tailrec private def _length(n: Int): Int = list match {  
   case Nil => n
   case head :: tail => new RichList(tail)._length(n+1)
 }
}
println(new RichList(List(1,2,3)).length)

/* fails

"error: could not optimize @tailrec annotated method length: it contains a recursive call not in tail position"

@tailrec def length(list: List[_]): Int = list match {  
  case Nil => 0
  case head :: tail => 1 + length(tail)
}

 */

/* succeeds */
// existential type variable because who cares? length doesn't.
def length(list: List[_]) = {
  @tailrec def _length(list: List[_], n: Int): Int = list match {
    case Nil => n
    case head :: tail => _length(tail, n+1)
  }
  _length(list, 0)
}
println(length(List(1,2,3)))

