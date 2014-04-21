// $ scala
// scala> :load macros.scala
import scala.tools.reflect.ToolBox

val toolbox = scala.reflect.runtime.universe.runtimeMirror(getClass.getClassLoader).mkToolBox()

def parse(expr: String) = toolbox.parse(expr)

val code = List("def sum(x: Int, y: Int): Int = { x + y }", "sum(1,2)").mkString("\n")
val tree = parse(code)

println(tree)
println
println("=>")
println
println(toolbox.eval(tree))

