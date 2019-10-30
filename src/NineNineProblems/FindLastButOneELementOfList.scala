package NineNineProblems

object FindLastButOneELementOfList extends App {
  def lastButOne[A](input: List[A]): A = {
    input match {
      case Nil => throw new NoSuchElementException
      case y :: Nil => throw new NoSuchElementException
      case l2 :: l1 :: Nil => l2
      case x :: tail => lastButOne(tail)
    }
  }

  val input = List(1, 2, 3, 4, 5, 6, 78)
  assert(lastButOne(input) == 6)
}
