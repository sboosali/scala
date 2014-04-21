def post(tweet: String) {
  require(tweet.length > 0,   {Error.inc; "tweet is too short"})
  require(tweet.length < 140, {Error.inc; "tweet is too long" })
  println(tweet)
}

// companion object hold static methods and static variables
object Error {
  var count = 0
  def inc {count += 1; count}
}


post("tweet!")

try { post("") }
catch { case err: java.lang.IllegalArgumentException => println(err.getMessage) }

try { post("") }
catch { case err: java.lang.IllegalArgumentException => println(err.getMessage) }

println(f"error count = ${Error.count}")
