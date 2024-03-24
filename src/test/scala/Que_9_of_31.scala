object Que_9_of_31 {
  def main(args:Array[String]):Unit={

  }

/* Divisibility by 5 AND 7:
  Write a Scala function to check if a given number is divisible by both 5 and 7.
  Sample Data:
  Number: 35 */

  val number = 35
  if(number%5 == 0 && number%7 ==0)
  {
    println(number+ " :- Given number is divisible by both 5 and 7 ")
  }
  else
  {
    println(number+ " :- Given number is not divisible by both 5 and 7 ")
  }

}
