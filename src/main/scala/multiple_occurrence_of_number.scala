object multiple_occurrence_of_number {
  def main(args:Array[String]):Unit={

  }
  /* Multiple Occurrences:
Find all the indices where the number 3 occurs in the array
[1,3,7,2,3,9,3] using linear search. */

var arr = Array(1, 3, 7, 2, 3, 9, 3)
val search_element = 3
  print(s"The indices the number $search_element occurs in the array :-\n")
for(i<- 0 until arr.length)
  {
    if(arr(i)==search_element)
      {
        println(i)
      }
  }


}
