import scala.annotation.tailrec

object Solution extends App {
  def solution(A: Array[Int]): Int = {
    // convert to Long to avoid overflows, then to List[Long]
    val B: List[Long] = A.map(_.toLong).toList
    testEquil(B, 0L, B.sum, 0)
  }

  @tailrec
  def testEquil(A: List[Long], leftSum: Long, rightSum: Long, P: Int): Int = {
    if (A.isEmpty) return -1
    if (leftSum == rightSum - A.head) return P
    testEquil(A.tail, leftSum + A.head, rightSum - A.head, P+1)
  }

  val result = Solution.solution(Array(-7, 1, 5, 2, -4, 3, 0))
print(result)
}