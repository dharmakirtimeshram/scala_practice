import scala.io.StdIn.readLine

object Que_18_of_31 {
  def main(args:Array[String]):Unit={

  }

 //Check square of entered number is even  or divisible by 4

  def sqr(a:Int):Int={
    a*a
  }

   val num= readLine("Enter Number:- ").toInt

    val num2 = sqr(num)
      println(s"square of $num:- $num2 ")

    if(num2%2==0 || num2%4==0)
    {
      println(num + " Square of entered number is even or divisible by 4")
    }
    else
      {
        println(num + "  Square of entered number is not  even or divisible by 4")
      }















}
