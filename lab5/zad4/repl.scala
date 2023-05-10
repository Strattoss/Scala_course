def df(f: Double => Double) = {
  (x: Double) => {
    val h = 1e-3
    (f(x + h) - f(x)) / h
  }
}

val sqr = (x: Double) => x * x
val dSqrExact = (x: Double) => 2 * x

val dSqrAppx = df(sqr)
