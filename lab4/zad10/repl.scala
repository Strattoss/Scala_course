def typedPatterns(tp: Any) = tp match {
  case s: String   => println("String matched, str = " + s)
  case i: Int      => println("Int matched, i = " + i)
  case b: Boolean  => println("Boolean matched, b = " + b)
  case a: Array[_] => println("Array matched, a = " + a)
  case _ => println("Default handler")
}