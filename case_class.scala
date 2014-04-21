case class Date(year: String, month: String, day: String)

val date = Date("1991", "03", "12")

date.copy(year="2014")

val Date(year, month, day) = date
