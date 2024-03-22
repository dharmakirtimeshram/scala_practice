object q29_dec_series {
  def main(args:Array[String]):Unit={

  }
  //To print the following series. 0.5^2, 0.7^2,0.9^2....5.1^2
  var i = 0.3f
  while(i <= 5 )
  {
    i = i + 0.2f
    println(f"$i%2.1f ^ " + 2)
  }



}
