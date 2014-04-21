// a for-comprehension ...
val sugar = for {
  i <- 1 until 10
  j <- 1 until (i-1)
  if ((i+j)%2==0)
} yield (i, j)

// ... is desugared to nested flatMap
// val desugar = (1 until 10) flatMap {
//   i => (1 until i-1) map {
//     j => if ((i+j)%2==0) {
//       yield (i, j)
//     }
//   }
// }
// last `bind` is just a `map` <- `flatMap` : M a -> (a -> M b) -> M b

println(sugar)
