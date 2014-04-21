val defaultdict = new HashMap[String, Int] {
  put("y", 2)
  override def default(key: String) = key.length
}

// INSTANTIATION { ... } makes anonymous subclass
