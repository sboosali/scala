def dont(code: => Unit) = new Dont(code)

class Dont(code: => Unit) {
  def unless(condition: => Boolean) =
    if (condition) code
}

// X if C else Y

