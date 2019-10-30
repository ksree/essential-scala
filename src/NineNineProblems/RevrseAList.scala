package NineNineProblems

object RevrseAList extends App{
  def reverseList[A](input: List[A]): List[A] = {
    input.foldLeft(List.empty[A])((a, r) =>  r :: a )
  }

  def reverseList2[A](input: List[A]): List[A] = {
    def reverseList2_(input:List[A], result: List[A]): List[A]  = {
      input match {
        case Nil => result
        case h :: tail => reverseList2_(tail, h :: result)

      }
    }
    reverseList2_(input, List.empty[A])
  }

  assert(reverseList(List(1,2,3,4,5)) == List(5,4,3,2,1))
  assert(reverseList2(List(1,2,3,4,5)) == List(5,4,3,2,1))

}
