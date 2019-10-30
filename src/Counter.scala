class Counter(val count: Int) {
  def inc: Counter = inc()

  def inc(amount: Int = 1): Counter = new Counter(count + amount)

  def dec: Counter = dec()

  def dec(amount: Int = 1): Counter = new Counter(count - amount)

  def adjust(adder: Adder): Counter = {
    new Counter(adder.add(count))
  }
}

class Adder(amount: Int) {
  def add(in: Int) = in + amount
}

object Counter extends App {
  val x = new Counter(10).dec.inc.dec.inc.count
  val y = new Counter(10).adjust(new Adder(5)).count
  assert(x == 10)
  assert(y == 15)

  println(x)
}