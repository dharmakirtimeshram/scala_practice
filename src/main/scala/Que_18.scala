import scala.io.StdIn.readLine
object Que_18 {
  def main(args:Array[String]):Unit={

  }

//Check if a given number is a perfect square using a "while" loop.

       var num = readLine("Enter Number :- ").toInt
               var i = 1
               while(i< num)
                {
                 if(num/i==i)
                 {
                 println(i +" :- square root of "+ num)
                 println("Perfect square")
                }
                 i= i+1
               }




}
