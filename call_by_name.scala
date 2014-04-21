// "x: () => Int" as value means thunk
// "x: => Int" as param means call-by-name

def never_call_by_name(c: =>C) = {}

def twice_call_by_name(c: =>C) = {c.x; c.x}

class C {
  var counter = 0
  println("new C")
  def x = {counter += 1; println(counter); counter}
}

def never_eager(c: C) = {}

def twice_eager(c: C) = {c.x; c.x}

println("call-by-name never")
never_call_by_name(new C)
println

println("call-by-name twice")
twice_call_by_name(new C)
println

println("never eager")
never_eager(new C)
println

println("twice eager")
twice_eager(new C)
println

