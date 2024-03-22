object q26_odd_num_even_series {
  def main(args:Array[String]):Unit={

  }
  //To print the following series. 1,even,3,even,5,even,.......35,even

  for(i<-1 to 36)
    if(i%2 != 0)
    {
      println(i)
    }
    else
    {
      println("even")
    }

}
