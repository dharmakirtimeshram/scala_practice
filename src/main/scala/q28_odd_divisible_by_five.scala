object q28_odd_divisible_by_five {
  def main(args:Array[String]):Unit={

  }
  //Write programs to print the following series. 1,3, divisible by five, 7,9,
  //11,13, divisible by five,.....21,23, divisible by five

  for(i<- 1 to 25 )
  {
    if(i%2 != 0)
      if (i % 5 !=0)
      {
        println(i)
      }
      else
      {
        println("divisible by five")
      }

  }



}
