import scala.io.StdIn.readLine
object Que_15 {
  def main(args:Array[String]):Unit={
  }

//Count the number of vowels in a given string using a "for" loop.

 val user_str = readLine("Enter string variable:- ")
  var user_str2 = user_str.toLowerCase

  var vowels = "aeiou"

  var count = 0
  for(i <-  user_str2)
  {
      if(vowels.contains(i))
      {
          count = count + 1
      }
  }
  println("Number of vowels in given string :-  " +count)

}
