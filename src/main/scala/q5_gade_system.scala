import scala.io.StdIn.readLine

object q5_gade_system {
  def main(args:Array[String]):Unit={

  }

  /* Declare & initialize a number. Check whether the number is in range 0-100
   or not. If not in range print invalid input. Else – if the number is in range 90-
     100 then print Super Smart, 80-90 print Smart,70-80 print smart enough,
   60-70 print just smart, 35-60 print no smart, 0-35 print dump.
    */

  val x = readLine("Enter the marks:- ").toInt
  if (x>0 && x < 100){
    println("input is valid")
  }
  if(x <=100 && x >90){
    println("super smart")
  }
  else if (x <=90 && x > 80){
    println("smart")
  }
  else if(x <=80 && x >70){
    println(" smart enough")
  }
  else if(x <= 70 && x > 60){
    println("just smart")
  }
  else if (x <= 60 && x > 35){
    println("no smart")
  }
  else if (x > 0 && x <= 35)
  {
    println("dumb")
  }
  else
  {
    println("input is invalid")
  }

}
