object HelloWorld {
  def main(args: Array[String]): Unit = {
    println(HelloWorld.fieldTest)
    println(HelloWorld.methodTest)
    println(HelloWorld.fieldTest)
    println(HelloWorld.methodTest)
  }
  val fieldTest: Int = {
    println("This is field test")
    43
  }
  def methodTest = {
    println("evaluating method Test")
    43
  }
}


