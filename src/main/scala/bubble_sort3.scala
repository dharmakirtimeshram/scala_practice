object bubble_sort3 {
  def main(args:Array[String]):Unit={

  }
// sort the given integers -20,15,10,5,25,30,35,40,2,8,18,22,12,7,33

val in_num = Array(20,15,10,5,25,30,35,40,2,8,18,22,12,7,33)
val sort2 = sort_array(in_num)
val sort_out = in_num.mkString(", ")
print(s"Sorted Integers :- ( $sort_out )")


 def sort_array(x:Array[Int]):Unit={
   val xlen = x.length-1
   for (i<- 0 until xlen)
     {
       for(j<- 0 until xlen-i)
         {
           if(x(j) > x(j+1))
             {
               val y = x(j)
               x(j)= x(j+1)
               x(j+1)=y
             }
         }
     }
 }


}
