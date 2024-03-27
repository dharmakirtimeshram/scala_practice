object smallest_element {
  def main(args:Array[String]):Unit={
  }
// Smallest Element:
  //Determine the smallest element in the array [6,3,8,2,5] using linear search.

  val arr = Array(6,3,8,2,5)

  val arr2 = arr.length
   var min = arr(0)
  for(i<- 0 until arr2)
    {
      if(min > arr(i))
        {
          min = arr(i)
        }
    }
  print(s"The smallest element in the given array is :-  $min ")








}
