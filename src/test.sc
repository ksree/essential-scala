import scala.util.matching.Regex

/*Your order, please
Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.

Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.
 */

object Text {

  def order(str: String): String = {
    val regex: Regex = """(.*?)(\d{1}\s*)""".r
    (for(m <- regex.findAllMatchIn(str))
    yield(m.group(0),m.group(1))).toSeq.sortBy(_._2.trim.toInt).map(_._1).mkString(" ")
  }
}