object find_even_odd {
  def main(args:Array[String]):Unit={

  }
//Even or Odd:
  //Check if the number 17 is even or odd in the array [4,9,12,17,22] using linear search.

  val arr = Array(4,9,12,17,22)
  val search = 17

  for(i<- 0 until arr.length) {
    if(arr(i)==search)
    {
      if(search != 0){
        println(s" $search number is a odd number")
      }
      else{
        println(s"$search is a even number")
      }
    }

  }


}
