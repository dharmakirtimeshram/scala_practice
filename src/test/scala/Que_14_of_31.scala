object Que_14_of_31 {
  def main(args:Array[String]): Unit = {

  }
/* Check for Non-Positive AND Even Number:
  Implement a Scala program to check if a given number is both non-positive and even.
  Sample Data:
  Number: -6   */

  var num = -6
  var check = num * -1
  var test = check + 1
  if(num%2==0 && num<test)
  {
    println(num +" :- Given number is both non-positive and even")
  }
  else
  {
    println(num +" :- given number is not non-positive and even")
  }



}
