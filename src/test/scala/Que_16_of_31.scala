object Que_16_of_31 {
  def main(args:Array[String]):Unit={

  }
/* Check for Divisibility by 2 OR 5:
  Write a Scala function to check if a given number is divisible by either 2 or 5.
  Sample Data:
  Number: 25   */

   var num = 25
  if(num%2 ==0 || num%5 ==0){
    println(num +" :- Given Number is divisible by 2 or 5")
  }
  else{
    println(num+" :- Given number is not divisible by 2 or 5")
  }



}
