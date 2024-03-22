object q27_odd_num_fact_of_three {
  def main(args:Array[String]):Unit={

  }
  // To print the following series. 1,2,factor of three,4,5,factor of three, 7,8,factor of three,
  // ..........22,23,factor of three.

  for(i<- 1 to 24)
  {
    if(i%3 != 0) {
      println(i)
    }
    else{
      println("factor of three  ")
    }
  }


}
