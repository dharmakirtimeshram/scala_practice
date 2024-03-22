import scala.io.StdIn.readLine

object q6_simple_math_operation {
  def main(args:Array[String]):Unit={

  }

  /*  Write a program to perform simple math based on the user inputs
     by using Switch condition.(+ , - , * , /).                   */

  val x: Int = readLine("Enter the value of x:- ").toInt
  val y: Int = readLine("Enter the value of y:- ").toInt
  print("Enter your operation (+,-,*,/,%) pick any one:- ")
  val cmd =scala.io.StdIn.readLine()

  if(cmd == "+")
  {
    val add = x + y
    println(f"$x + $y = $add")
  }
  else if (cmd == "-")
  {
    val sub = x - y
    println(f"$x - $y = $sub ")
  }
  else if(cmd == "*")
  {
    val mul = x*y
    println(f"$x * $y = $mul")
  }
  else if(cmd =="/")
  {
    if(y==0)
    {
      print("Error! invalid input")
    }
    else
    {
      val dvd = x/y
      println(f"$x / $y = $dvd")
    }
  }
  else
  {
    println("Invalid operation")
  }


}
