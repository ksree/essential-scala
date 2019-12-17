package ArrayProblems

object Permutations extends App{

  def checkPermutations(inp1: String, inp2: String): Boolean = {
    if(inp1.length != inp2.length) return false
    else if(inp1.length == inp2.length && sort(inp1) == sort(inp2)) true
    else false
  }

  def sort(in: String): String = {
    in.sorted
  }
  val t = Array("I")
  assert(checkPermutations("NoMoTown", "MoNoTown"), true)
  assert(checkPermutations("DSfsdfsdfsdsfsdf", "MoNoTown"), false)


}
