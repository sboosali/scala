case class Point(x:Int = 0, y:Int = 0, z:Int = 0)

val p = Point(1,2,3) // apply

println
println(p) // toString

/* p.x = 13 // immutable (static write-to-val error) */

println(Set(Point(), Point())) // equals and hashCode

List(p, p, p) match { // unapply
  case List(Point(x, _, _), Point(1, y, _), q: Point) => println(x + y + q.z)
}

/* Java
public class Point {
  final int x;
  final int y;
  Foo(int x, int y) {
    this.x = x;
    this.y = y;
  }
  public bool equals(...
  public String toString(...
  public int hashCode(...
}
*/
