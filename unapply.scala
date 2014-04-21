// unpack case class
val regex = "(\\d+)-(\\d+)-(\\d+)".r
val regex(year, month, day) = "1991-03-12"

// desguared
val Some(Seq(year, month, day)) = regex.unapplySeq("1991-03-12")

// may raise runtime match error

class Point(val x: Int = 0, val y: Int = 0)
object Point { def unapply(p: Point) = Some((p.x, p.y)) }
