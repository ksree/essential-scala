package NineNineProblems

object PackConsecutiveDuplicatesInList extends App {
  def pack[A](input: List[A]) = {
    def pack[A](res: List[List[A]], rem: List[A]): List[List[A]] = {
      rem match {
        case Nil => res
        case h :: tail => if (res.isEmpty) pack(List(List(h)) ::: res, tail)
        else if (res.head.head != h) {
          pack(List(List(h)) ::: res, tail)

        } else {
          pack(List(List(h) ::: res.head) ::: res.tail, tail)
        }

      }
    }
    pack(List(), input)
  }
  println(pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))

}