package NineNineProblems

object RunLengthEncodingListP14 extends App {
  def encodeDirect[A](input: List[A]): List[(Int, A)] = {
    def encodeDirect[A](result: List[(Int, A)], input: List[A]): List[(Int, A)] = {
      input match {
        case Nil => result
        case h :: tail => if (result.isEmpty || h != result.last._2) encodeDirect(result ::: List((1, h)), tail) else {
          encodeDirect(result.init ::: List((result.last._1 + 1, result.last._2)), tail)
        }
      }
    }
    encodeDirect[A](List.empty[(Int, A)], input)
  }
 print(encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  assert(encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
}

