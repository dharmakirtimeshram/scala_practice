object q12_count_even_num {
  def main(args:Array[String]):Unit={

  }
  //Write a Program to print the count of the even numbers between the given range?(251-51)

  var count = 0
  var i = 0
  for(i<- 251 to 51 by -1)
    if (i%2==0)
    {
      count = count + 1
      //println(i)
    }
  println("Total count of even numbers between 251 - 51 is :- " + count)


}
