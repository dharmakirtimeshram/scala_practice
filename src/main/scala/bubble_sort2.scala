object bubble_sort2 {
  def main(args:Array[String]):Unit={

  }
// sort the given array
val in_array =Array(12,6,8,4,15,7,3,10,2,9,5,11,1,14,13)
val len_arr = sort_array(in_array)
val sort2 = in_array.mkString(", ")
print(s"Sorted Array :- Array($sort2 )")

def sort_array(x:Array[Int]):Unit={
  val xlength = x.length-1
  for(i<- 0 until xlength)
    {
      for(j<- 0 until xlength-i)
        {
          if(x(j)>x(j+1))
          {
            val temp = x(j)
            x(j)=x(j+1)
            x(j+1)=temp
          }
        }
    }
}


}
