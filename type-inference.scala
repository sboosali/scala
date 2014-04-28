import collection.mutable.HashMap
val no_inference    : HashMap[String, Int] = new HashMap[String, Int]
val object_inference: HashMap[String, Int] = new HashMap
val reference_inference                    = new HashMap[String, Int]
val full_inference                         = HashMap("x" -> 1)

Set(1, "2", Set(3))
// the Set is still homogeneous and strongly statically typed
// but its type is scala.collection.immutable.Set[Any]
