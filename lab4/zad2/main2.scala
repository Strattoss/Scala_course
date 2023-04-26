object Appl43 {
  def checkPredicate( /* ... */ ) = { /* ... */ }

  def maxIter(elems: Array[Int]) = {
    var max = 0
    for (i <- elems) if (i > max) max = i
    max
  }

  def maxRec1(i: Int, maxEl: Int, elems: Array[Int]): Int = {
    if (i < elems.size) maxRec1(___, math.max(___, ___), elems)
    else ___
  }

  def maxRec2(elems: Array[Int]) = {
    def goFrom(i: Int, maxEl: Int, size: Int): Int = {
      if (i < size) goFrom(___, math.max(___, ___), size)
      else ___
    }
    goFrom(0, ___, ___)
  }
  
  def main(args: Array[String]) {
    val arr1 = Array(3, 12, 43, 4, 10)
    println("Testing with arr1 = " +
            arr1.mkString("Array(", ", ", ") ..."))
    val expectResult = 43
    checkPredicate(maxIter(arr1) == expectResult,
                   "maxIter(arr1) == " + expectResult)
    checkPredicate(maxRec1(0, ___, arr1) == expectResult,
                   "maxRec1(0, ___, arr1) == " + expectResult)
    checkPredicate(maxRec2(arr1) == expectResult,
                   "maxRec2(arr1) == " + expectResult)
  }
}