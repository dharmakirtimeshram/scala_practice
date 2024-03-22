object q19_sum_of_series {
  def main(args:Array[String]):Unit={

  }
  //Write programs to sum of the following Series. 52 + 62 + 72 +..........+1022.
  var sum = 0
  var i = 0
  for(i<- 52 to 1022 by 10)
  {
    //println( i )
    sum = sum +i
  }
  println("Sum of Series 52 + 62 + 72 + ........ +1022  :- " +sum)


}
