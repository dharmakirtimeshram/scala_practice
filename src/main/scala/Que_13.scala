import scala.io.StdIn.readLine
object Que_13 {
  def main(args:Array[String]):Unit={

  }

  //Check if a string is a palindrome using a "for" loop.

    var user_in =readLine("Enter your string element - ").toString


    var rev = ""

    def is_pali(str:String):String={
      for(i<- str.length - 1 to 0 by -1){
        rev = rev +str(i)
      }
      rev
    }

        var test2 = is_pali(user_in)
         println(test2)

         if(test2 == user_in){
           println("palindrome")
         }
         else
         {
             println("not palindrome")
         }




 }


