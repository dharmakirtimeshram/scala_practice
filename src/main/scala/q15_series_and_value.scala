object q15_series_and_value {
  def main(args:Array[String]):Unit={

  }
  // Print following series 2*3,3*4,4*5,....16*17
  // (Print in two ways – pattern & multiplied value)

  var x = 1
  var y = 1
  for(i<- 2 to 16)
  {
    x = x+1
    y = x + 1
    val xy = x * y
    println( s" $x*$y  =  $xy ")


  }



}
