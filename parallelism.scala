// use Vector not List to avoid copying
def time(f: =>Any, msg: String = "") = {
  val before = System.currentTimeMillis
  val x = f
  val after  = System.currentTimeMillis
  val t = (after - before)
  println(f"[time] [$msg] ${t}ms")
  x
}

val n = 2 * 1000 * 1000
lazy val sequential = { (1 to n)    .map(_+1) }
lazy val parallel   = { (1 to n).par.map(_+1) }

time(sequential, "sequential")
time(parallel,   "parallel")

