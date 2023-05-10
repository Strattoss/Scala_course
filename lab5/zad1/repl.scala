class NumOps {
  def succ(a: Int) = a + 1
  def pred(a: Int) = a - 1
}

class Succ extends Function1[Int, Int] {
  override def apply(a: Int) = a + 1
}

class Pred extends Function1[Int, Int] {
  override def apply(a: Int) = a - 1
}
