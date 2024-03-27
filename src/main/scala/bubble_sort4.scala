// sort the integers - 45,28,14,37,19,8,53,41,30,12,25,48,9,36,21
object bubble_sort4 {
  def main(args:Array[String]):Unit={
    val in_num = Array(45,28,14,37,19,8,53,41,30,12,25,48,9,36,21)
    val sort2 = sort_Array(in_num)
    val sort_out = in_num.mkString(", ")
    print(s"Sorted Integers :- ( $sort_out )")
  }

def sort_Array(x:Array[Int]):Unit={
  val xlength = x.length-1
  for(i<- 0 until xlength)
    {
      for(j<- 0 until xlength-i)
        {
          if(x(j) > x(j+1))
            {
              val y = x(j)
              x(j)= x(j+1)
              x(j+1) = y
            }
        }
    }

}



}
