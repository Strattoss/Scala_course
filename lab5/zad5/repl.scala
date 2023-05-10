def f1(f: () => Int) = println("The number is: " + f())
def f2(f: Unit => Int) = println("The number is: " + f(()))
def f3(f: => Int) = println("The number is: " + f)