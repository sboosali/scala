def sum(xs: Int*) = xs.fold(0) {_ + _}

println(sum(1,2,3,4))
