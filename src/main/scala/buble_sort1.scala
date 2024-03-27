object buble_sort1 {
  def main(args:Array[String]):Unit={

  }
  // Sort the given array
  val in_arr = Array(8,3,5,1,9,4,6,2,7)
  val arr2 = sort_array(in_arr)
  val sort2 = in_arr.mkString(",")
  print(s" Sorted Array :-Array( $sort2 ) ")

  def sort_array(x:Array[Int]):Unit={
    val num = x.length-1
    for(i<- 0 until num)
      {
        for(j<- 0 until num - i)
          {
            if(x(j) > x(j+1))
              {
                val temp = x(j)
                x(j)=x(j+1)
                x(j+1)=temp
              }
          }
      }
  }


}
