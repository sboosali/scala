import scala.actors.Actor._

val echoer = actor {
  var count = 0
  println("[echo] [start]")
  while (true) {
    receive {

      case "hi" =>
        count += 1
        println(f"[echo] hi $count")

      case "bye" =>
        println("[echo] [end]")
        exit()

      case message =>
        println(f"[echo] $message")
    }
  }
}

// "!" means "tell" is async returns Unit
echoer ! "hi"
echoer ! "hi"
echoer ! "hi"
echoer ! "hi"
echoer ! "hi"
echoer ! "hello"
echoer ! "bye"

println("(rest of the script)")
