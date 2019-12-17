object OneAway extends App{

  def oneEditAway(str1: String, str2: String): Boolean ={

    if(str1.length ==str2.length){
      return oneEditReplace(str1, str2)
    }
    false
  }

  def oneEditReplace(str1: String, str2: String) : Boolean ={
    var foundDifference = false
    for(i <- 0 until str1.length){
     if(str1.charAt(i) != str2.charAt(i)){
       if(foundDifference) return false
       foundDifference = true
      }
    }
    true
  }



  assert(oneEditAway("apple", "abple"))
  assert(!oneEditAway("apple", "abble"))

}
