object element_count {
  def main(args:Array[String]):Unit={

  }
 // Element Count: Count the number of occurrences of 7 in the array
  //[7,2,9,3,7,5,7] using linear search.

   val arr = Array(7,2,9,3,7,5,7)
   val search = 7
   var count = 0
   for(i<- 0 until arr.length)
     if(arr(i)==search){
       count=count+1
     }
     println(s"$search number is $count times present in a given Array")








}
