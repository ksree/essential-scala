package NineNineProblems

object DecodeRunLenthEncodedList extends App {
  def decode[A](input: List[(Int, A)]): List[A] = {
    input.foldLeft(List.empty[A])((result: List[A], input: (Int, A)) => {
      val tmp: List[A] = List.empty[A]
      val x: Seq[A] = for {
        n <- 1 to input._1
        r <-  tmp ::: List(input._2)
      } yield {
         r
      }
      result ::: x.toList

    })
  }

  println(decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))))
  assert(decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) ==  List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))

}
