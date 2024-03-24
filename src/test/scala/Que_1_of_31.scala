object Que_1_of_31 {
  def main(args:Array[String]):Unit={

  }
/* Check for Even AND Positive Number:
  Write a Scala function to check if a given number is both even and positive. */

            var num = 14
            var check = num * -1
            var test = 1 + check

         if(num%2==0 && test < num)
         {
             println(num + ":- positive & even")
         }
         else if(num%2==0 && test >num)
         {
           println(num +" :- even but negative")
         }
         else{
           println(num + " :- odd number")
         }


}
