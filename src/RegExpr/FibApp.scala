import scala.collection.mutable

object Sol extends  App {


  def memoizeFnc[K, V](f: K => V): K => V = {
    val cache = collection.mutable.Map.empty[K, V]

    k =>
      cache.getOrElse(k, {
        cache update(k, f(k))
        cache(k)
      })
  }


  val fib: Int => BigInt = memoizeFnc(n => n match {
    case 0 => 0
    case 1 => 1
    case _ => fib(n-2) + fib(n-1)
  }
  )

  println(Sol.fib(70))
}