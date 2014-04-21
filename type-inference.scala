import collection.mutable.HashMap
val no_inference    : HashMap[String, Int] = new HashMap[String, Int]
val object_inference: HashMap[String, Int] = new HashMap
val reference_inference                    = new HashMap[String, Int]
val full_inference                         = HashMap("x" -> 1)

case class C
Set(C, C)     // scala.collection.immutable.Set[C.type]
Set(C, C())   // scala.collection.immutable.Set[Serializable]
Set(C(), C()) // scala.collection.immutable.Set[C] 

