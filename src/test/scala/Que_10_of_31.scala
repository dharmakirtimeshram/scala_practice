object Que_10_of_31 {
  def main(args:Array[String]):Unit={

  }

 /* Check for Non-Negative OR Even Number:
  Create a Scala program to check if a given number is either non-negative or even.
  Sample Data:
  Number: -8  */

      val num = -9
      val test2 = num *(-1)
      val test = test2 + 1
     if(num%2 ==0 || num>test)
     {
       println(num+ "  :- Given number either non-negative or even ")
     }
     else
     {
       println(num + " :- Given number neither non-negative nor even")
     }

}
