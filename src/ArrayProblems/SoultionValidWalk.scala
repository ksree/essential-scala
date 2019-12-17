
object SoultionValidWalk extends  App {
  def isValidWalk(walk: Seq[Char]): Boolean = {
    walk.size == 10 && (walk.count(_ == 'n') == walk.count(_ == 's')) && (walk.count( _ == 'e') == walk.count(_ == 'w'))
  }

}
