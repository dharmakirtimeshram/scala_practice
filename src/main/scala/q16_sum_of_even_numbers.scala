object q16_sum_of_even_numbers {
  def main(args:Array[String]):Unit={

  }
  // Write a program to sum all even numbers between 382 and 582.
  var sum = 0
  for(i<- 382 to 582)
    if(i%2==0)
    {
      //println(i)
      sum = sum+i
    }
  print("Sum of all even numbers between 382 to 582 :- "+sum)



}
