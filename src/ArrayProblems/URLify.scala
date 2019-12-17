package ArrayProblems

object URLify extends App{

  def replace(input: String): String ={
    input.map(e => if(e == ' ') "%20" else e).mkString("")
  }

  println(replace("Mr John Smith"))
  assert(replace("Mr John Smith") == "Mr%20John%20Smith")

}
