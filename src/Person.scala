class Person(val firstName: String, val lastName: String) {
  def name : String = s"$firstName $lastName"
}

object Person extends App {
  def apply(first: String, last: String) ={
    new Person(first, last)
  }
  def apply(name: String) ={
    val parts = name.split(" ")
    new Person(parts(0), parts(1))
  }
  def apply() = new Person("Kapil", "Sreedharan")
  assert(Person("Kapil", "Sreedharan").firstName == "Kapil")
  assert(Person("Kapil Sreedharan").firstName == "Kapil")

}

