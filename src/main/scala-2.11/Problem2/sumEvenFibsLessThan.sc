def fib(a: BigInt = 0, b: BigInt = 1): Stream[BigInt] =
  Stream.cons(a, fib(b, a+b))
val fibsAll = {fib() takeWhile {_ <= 4000000 } toList} filter(_ % 2 == 0) sum