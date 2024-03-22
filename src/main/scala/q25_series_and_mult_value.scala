object q25_series_and_mult_value {
  def main(args:Array[String]):Unit={

  }
  // Write programs to print the following series. 5*4,5*3,5*2,......5*(-12)
  // (Print in two ways – patter & multiplied value)
  var x = 5
  for(i<- 4 to  -12 by -1)
  {
    var xy = x * i
    println(s" $x * $i =  $xy")
  }



}
