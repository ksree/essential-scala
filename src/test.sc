val y = List(15, 10, 5, 8,2, 20, 12)

y.span( _ %2 == 0 )


abstract class Post
abstract class Pull

val hex = "0100"
val l = hex.size

Integer.parseInt(hex, 2)


hex.toLowerCase().toList.map("0123456789abcdef".indexOf(_)).map(e => {println(e * 16); e }).reduceLeft(_ * 16 + _)


hex.toLowerCase().toList.map("0123456789abcdef".indexOf(_))

0 +48 + 64  + 160 + 176  + 192

def baseToInt(base: String, input: String): Int ={
  input.toList.map(base.indexOf(_)).map(e=> { println(e + "*" + base.length); e}).reduceLeft(_ * base.length + _)
}

baseToInt("01", "0010")
val a = Array(1,2,3,4)

var min: Int = Int.MaxValue
var max: Int = Int.MaxValue


for(i: Int <- Array(1,2,3,4,5)){
   if(i < min) min = i;
   if(i > max) max = i;
}


def isPrime(n: Int): Boolean = {
  for(x <- (2 to Math.sqrt(n).toInt) ){
    println(x)
    if(n % x == 0)  return false
  }
  return true
}

isPrime(3)