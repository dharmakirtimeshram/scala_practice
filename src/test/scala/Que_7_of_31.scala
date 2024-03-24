import scala.io.StdIn.readLine
object Que_7_of_31 {
  def main(args:Array[String])={

  }
/* Check for Negative AND Odd Number:
  Implement a Scala program to check if a given number is both negative and odd.  */

  var num = readLine("Enter number :- ").toInt
  var test= (num *(-1))
  var test2 = test+1
  if(num%2 != 0 && num < test2){
    println(num +" :- number is negative and odd ")
  }
  else{
    println(num +" :- number is not  negative and  odd ")
  }




}
