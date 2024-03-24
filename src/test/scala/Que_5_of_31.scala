import scala.io.StdIn.readLine
object Que_5_of_31 {
  def main(args:Array[String]):Unit={

  }
/* Eligibility for Voting OR Driving:
  Create a Scala program to check if a person is eligible to vote (age greater than or equal to 18) or
  eligible to drive (age greater than or equal to 16).   */

     var age = readLine("Enter age :- ").toInt

     if(age>=18 || age >= 16) {
       if (age >= 18)
       {
         println("Eligible for vote and drive")
       }
       else if (age >= 16 && age < 18)
       {
         println("Eligible for drive but not for vote")
       }
     }
     else
     {
       println("minor")
     }



}
