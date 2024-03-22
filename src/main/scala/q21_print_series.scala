object q21_print_series {
  def main(args:Array[String]):Unit={

  }
  //to print the series : 10@9,9@8,8@7.......-5@-6

  for( i<- 10 to -5 by -1 )
  {
    println(i + "@" + (i - 1))
  }



}
