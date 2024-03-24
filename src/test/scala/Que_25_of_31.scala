object Que_25_of_31 {
  def main(args:Array[String]):Unit={

  }

/* Check for Positive AND Not Divisible by 3:
  Implement a Scala program to check if a given number is positive and not divisible by 3.
  Sample Data:
  Number: 7  */

  val num= 7
  val num2=num* -1
  val test = num2+1
  if(num%3 !=0 && num>test){
    println(num+"-This number is positive and not divisible by 3")
  }
  else{
    println("condition not satisfied")
  }



}
