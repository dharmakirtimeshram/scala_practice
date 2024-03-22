object q18_avg_num {
  def main(args:Array[String]):Unit={

  }
  //Write a program to find the average of 24,26,28,.....100.
  var sum = 0
  var count = 0
  var i = 0
  for(i<- 24 to 100 by 2)
  {
    //println(i)
    sum = sum+i
    count = count +1
  }
  //println("sum of even numbers :- " +sum)
  //println("count of even numbers :- " +count)

  val avg = sum/count
  println("Average of even numbers between 24 to 100 :- " + avg)


}
