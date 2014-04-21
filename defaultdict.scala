import collection.mutable.HashMap
val h = new HashMap[String, Int]() { override def default(key: String) = key.length }
h += ("y" -> 2)
println(h("x"))

val m = Map("y" -> 2).withDefaultValue(0)
println(m("x"))
