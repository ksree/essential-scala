class Timestamp(val seconds: Long)

object Timestamp extends  App {
  def apply(hours: Int, minute: Int, second: Int): Timestamp = {
    new Timestamp(hours * 60 * 60 + minute * 60 + second)
  }
  val seconds = Timestamp(0, 0 , 10).seconds
  assert(seconds == 10)
}