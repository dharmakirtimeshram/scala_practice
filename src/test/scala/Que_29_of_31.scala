object Que_29_of_31 {
  def main(args:Array[String]):Unit={

  }
/* Check for Non-Negative AND Not Divisible by 7:
  Implement a Scala program to check if a given number is non-negative and not divisible by 7.
  Sample Data:
  Number: 14   */

  val num = 14
  var num2 = num * -1

  var num3 = num2 +1

     if(num%7 !=0 && num > num3)
     {
       println(num + " - Given number is positive and not divisible by 7")
     }
     else{
    println("Not satisfied given condition")
  }




}
