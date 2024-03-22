object q11_odd_numbers {
  def main(args:Array[String]):Unit={

  }
  // Write a program to print all odd numbers from 251 to 51. like (251, 249,...51)

  for (i<- 251 to 51 by -1)
    if(i%2 != 0)
    {
      print(i+ ",")

    }


}
