import scala.io.StdIn.readLine

object q4_even_odd {
  def main(args:Array[String]):Unit={

  }

  /* Write a scala program that performs the following tasks.
      a. Store a number in a variable
      b. If value is not in range (100-1000) prints wrong number else follows the steps
      c. Check even or odd
      d. If even divide the number by 3 and print the remainder
      e. If odd divide the number by 2 and print the remainder.*/

  val x = readLine("Enter the number:- ").toInt

  if ( x < 100 || x > 1000)
  {
    println("Entered number is wrong, not in range")
  }
  else
  {
    if(x%2==0){
      println("Entered number is even")
      val rem = x%3
      println(f" $x/3 = $rem")
    }
    else
    {
      println("Entered number is odd")
      val rem2 = x % 2
      println(f" $x/2 = $rem2")
    }
  }



}
