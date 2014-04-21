def time[T](thunk: => T): T = {
  val start = System.nanoTime
  val ret = thunk
  val end = System.nanoTime
  val duration = (end - start) / 1000000.0
  println(f"${duration}ms => ${ret}")
  ret
}

