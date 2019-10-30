package Combinator

object ThreeSums extends App{
  def threeSum(nums: Array[Int]): List[List[Int]] = {
    val sortedNums = nums.toList.sortWith(_ < _)
    for {
      (a, i) <- sortedNums.zipWithIndex
      (b, j) <- sortedNums.zipWithIndex.drop(i + 1)
      c <- sortedNums.drop(j+1)
      if a + b + c ==0
    } yield List(a, b, c)
  }

  val num = Array(-1, 0, 1, 2, -1, -4)
  print(threeSum(num))
  val x = threeSum(num)

}
