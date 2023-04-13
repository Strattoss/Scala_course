import scala.beans.BeanProperty

class Person(val givenName: String, @BeanProperty var surname: String, val id: String) {}

object Appl {
  def main(agrs: Array[String]) = {
    val p = new Person("Jan", "Kowalski", "1234567890")
    println(p.givenName)
    println(p.getSurname)
  }
}