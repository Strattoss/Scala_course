def f(argByVal: Long, argByName: => Long) = {
  Thread.sleep(1000)
  println("In function: " + argByVal + ", " + argByName)
}
