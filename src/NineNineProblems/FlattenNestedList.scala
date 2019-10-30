package NineNineProblems

object FlattenNestedList extends App{
  def flatten[A](input: List[A]): List[A] = {
    input.foldLeft(List.empty[A])((r, e) => e :: r )
  }

  assert(flatten(List(List(1, 1), 2, List(3, List(5, 8)))) == List(1, 1, 2, 3, 5, 8))
}
