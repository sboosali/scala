// Scala
val map = Map("x" -> 1, "y" -> 2)
for((key,value) <- map) {
  println(f"$key, $value")
}

/* Java
HashMap<String, Integer> map = new HashMap<String, Integer>();
map.add("x", 1);
map.add("y", 2);
for(Map.Entry<K,V> entry: map.getEntrySet()) {
  K key = entry.getKey();
  V value = entry.getValue();
  System.out.println(key + ", " + value)
}
*/
