
object last_occurrence_number {
  def main(args:Array[String]):Unit={
  }
  /*Last Occurrence:
Find the index of the last occurrence of 11 in the array
[4,8,2,11,6,11,7] using linear search.*/

val arr = Array(4, 8, 2, 11, 6, 11, 7)
val search_element = 11
var last_index = 0
for(i<- 0 until arr.length)
  {
   if(arr(i)==search_element)
     {
      last_index = i
     }
   }
   if(last_index != 0){
     println("The index of the last occurrence of 11 in the array :- " +last_index)
}

}









