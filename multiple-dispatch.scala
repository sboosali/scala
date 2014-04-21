class Point(val x: Int = 0, val y: Int = 0) {
  def +(p: Point): Point = new Point(x + p.x, y + p.y)
  def +(px: Int, py: Int) = new Point(x + px, y + py)
  override def toString = f"Point($x, $y)"
}

println (new Point(1,2) + new Point(3,4))
println (new Point(1,2) + (3,4))
/* println ((1,2) + new Point(3,4)) // static type error */
