package NineNineProblems

object LengthEncodingOfList extends App {

  def pack[A](input: List[A]): List[List[A]] = {
    def pack[A](result: List[List[A]], input: List[A]): List[List[A]] = {
      input match {
        case Nil => result
        case h :: tail => if (result.isEmpty || result.last.head != h) pack(result ::: List(List(h)), tail)
        else pack(result.init ::: List(result.last ::: List(h)), tail)
      }
    }

    pack(List.empty, input)
  }

  def lengthEncodingOfList[A](input: List[A]): List[(Int, A)] = {
    val packedList: List[List[A]] = pack(input)
    packedList.map(e => (e.size, e.head))
  }

  def modifiledLengthEncodingOfList[A](input: List[A]): List[Any] = {
    val packedList: List[List[A]] = pack(input)
    packedList.map(e => {if(e.size <= 1) e.head else (e.size, e.head)})
  }

  print(lengthEncodingOfList(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))

  assert(pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))

  assert(lengthEncodingOfList(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))

  print(modifiledLengthEncodingOfList(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  assert(modifiledLengthEncodingOfList(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e)))
}
