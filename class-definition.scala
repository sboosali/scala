class Point(val x: Int, val y: Int) {
  def +(p: Point) = new Point(x + p.x, y + p.y)
  override def toString = f"Point($x, $y)"
}

println(new Point(1,2) + new Point(3,4))
