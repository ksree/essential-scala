package NineNineProblems

import java.util.NoSuchElementException

object FindLastElementOfList extends App{
  val x = List(1,2,3,4,5,6,7,78)

  def last[A](input: List[A]): A = {
      input match {
        case x :: Nil => x
        case h :: tail => last(tail)
        case _ => throw new NoSuchElementException

    }
  }
  assert(last(x) == 78)

}
