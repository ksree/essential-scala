var cache: Map[Int, Int] = Map.empty
def cacheGet(n:Int) = cache.getOrElse(n, 0)

def fib(n: Int): BigInt =  {
  // your code here
  if(cacheGet(n) ==0)
    cache = cache + (n -> fibonacci(n))

  cacheGet(n)
}

def fibonacci(n: Int): Int = n match {
  case 0 | 1 => n
  case _ => {
    val x = fibonacci(n - 1)
    val y = fibonacci(n - 2)
    cache = cache + (n -> x)
    cache = cache + (n -> y)
    x + y
  }
}

fibonacci(2)
fib(3)

