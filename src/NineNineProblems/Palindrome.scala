package NineNineProblems

object Palindrome extends App {
  def isPalindrome[A](input: List[A]): Boolean = {
    input == input.reverse
  }
  assert(isPalindrome(List(1, 2, 3, 2, 1)) == true)

}
