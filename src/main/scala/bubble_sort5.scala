object bubble_sort5 {
  def main(args:Array[String]):Unit={

  }

  // Sort the given integers - 17,22,11,29,8,15,36,7,24,19,13,32,5,27,10
  val in_num =Array(17,22,11,29,8,15,36,7,24,19,13,32,5,27,10)
  val sort2 = sort_array(in_num)
  print(s"Sorted Integers :-  " +in_num.mkString(", "))

def sort_array(x:Array[Int]):Unit={
  val xlength = x.length-1
  for(i<- 0 until xlength)
    {
      for(j<- 0 until xlength - i)
        {
          if(x(j) > x(j+1))
            {
              val y = x(j)
              x(j) = x(j+1)
              x(j+1) = y
            }
        }
    }
}

}
