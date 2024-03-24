import scala.io.StdIn.readLine

object Que_6_of_31 {
  def main(args:Array[String]):Unit={

  }
// write a Scala function to check if a given number is in the range [1, 10] or [20, 30].


   var user_input =readLine("Enter value for check :- ").toInt

  if(user_input>0 && user_input <= 10 || user_input>=20 && user_input<=30){
    println("value is in range")
  }
  else{
    println("Value not in range")
  }




}

