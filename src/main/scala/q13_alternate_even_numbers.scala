object q13_alternate_even_numbers {
  def main(args:Array[String]):Unit={

  }
  // Write a program to print alternate even numbers from 20 to 140. Like (20,24,28...)

  for (i <- 20 to 140 by 4)
    if (i % 2 == 0)
    {
      print(i + ",")
    }



}
