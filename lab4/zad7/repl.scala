def printContInfo(c: Any) = c match {
  case 1     => println("1 matched")
  case 1.1   => println("1.1 matched")
  case 1.1f  => println("1.1f matched")
  case "42"  => println("'42' matched")
  case true  => println("true matched")
  case false => println("false matched")
  case ()  => println("() matched")
  case any =>
    println("Variable pattern matched, matched: " + any)
}