package implicitclass

//Should be defined within a object, class or package object
object IntUtils {

  implicit class IntOps(n: Int) {
      def time(fn: Any => Unit):Unit  = {
        (0 until n).foreach(fn(_))
      }

  }

}

object test extends App {
  import IntUtils._

  val input: Any => Unit  = x => println("Value is " + x)
  10.time(input(_))
}