package NineNineProblems

import com.sun.tools.doclets.internal.toolkit.util.DocFinder.Input

object FindNumberOfElementsList extends App {
  def numberOfElements[A](input: List[A]): Int = {
    def numberOfElements_[A](input: List[A], n: Int): Int = {
      input match {
        case Nil => n
        case _ :: tail => numberOfElements_(tail, n + 1)
      }
    }

    numberOfElements_(input, 0)
  }

  def numberOfElements2[A](input: List[A]): Int = {
    input.foldLeft(0)((n, _) => n + 1)
  }

  assert(numberOfElements(List(1, 2, 3, 4, 5)) == 5)
  assert(numberOfElements2(List(1, 2, 3, 4, 5)) == 5)

}
