package NineNineProblems

object KthElementOfList extends App {
  def kthElement[A](input: List[A], k: Int): Any = {
    if (input.size < k) throw new NoSuchElementException
    else {
      val x: List[Any] = for {
        (e, i) <- input.zipWithIndex
        if i+ 1 == k
      } yield {
        e
      }
      x(0)
    }

  }

  def KthElement2[A](input: List[A], k: Int): A = {
    (input, k) match{
      case (h :: _ , 1 ) => h
      case (_ :: tail, n ) => KthElement2(tail, n-1)
      case (Nil, _) => throw new NoSuchElementException
    }
  }

  assert(kthElement(List(1,2,3,4,5), 2) == 2)
  assert(KthElement2(List(1,2,3,4,5), 2) == 2)

}
