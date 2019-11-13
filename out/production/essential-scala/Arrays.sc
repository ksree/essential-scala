val duplicateInputs= "systemmatic"
val noDuplicateInputs= "abcdefghijk"

//find if duplicates in string
def duplicates(input: List[String]):Boolean = {
  def dup(input: List[String]) : Boolean = input match {
    case Nil => false
    case h :: tail => if(tail.contains(h)) true else
      dup(tail)
  }
  dup(input)
}
assert(duplicates(duplicateInputs.map(_.toString).toList) == true)
assert(duplicates(noDuplicateInputs.map(_.toString).toList) ==false)

def isUnique(input: String): Boolean = {
  if(input.distinct == input) true
  else false
}

isUnique(duplicateInputs)
isUnique(noDuplicateInputs)

