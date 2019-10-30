object Equilibrium extends App {


  def equilibrium(input: Array[Int]): List[Int] = {
    val totalSum: Int = input.sum
    var leftSum = 0
    var rightSum = totalSum - input(0)
    var out: List[Int] = List.empty[Int]
    if(leftSum == rightSum) out = out ::: List(0)
    for(i <- 1 until input.length){
        leftSum = leftSum + input(i-1)
        rightSum = rightSum - input(i)
        println("index is " + i + "|  left " + leftSum + "|  right sum" + rightSum)
        if (leftSum == rightSum )  out = out ::: List(i) ;
    }
    out
  }

  def equilibriumTail(input: Array[Int]): List[Int] = {
    //if (input.isEmpty)return -1
    def equilibriumTail_R(input: Array[Int], leftSum: Int, rightSum: Int, p: Int, out: List[Int]): List[Int] = {
      println("index is " + p+ "|  left " + leftSum + "|  right sum" + rightSum)

      if (input.tail.isEmpty) return out
      leftSum.equals(rightSum) match {
        case true => equilibriumTail_R(input.tail, leftSum + input.head, rightSum - input.tail.head, p + 1, p :: out)
        case false => equilibriumTail_R(input.tail, leftSum + input.head, rightSum - input.tail.head, p + 1, out)
      }
    }
    equilibriumTail_R(input, 0, input.sum - input.head, 0, List.empty[Int])
  }
    println(equilibrium(Array(-1,3,-4,5,1,-6,2,1)))
    println(equilibriumTail(Array(-1,3,-4,5,1,-6,2,1)))

}
