object Que_12 {
  def main(args:Array[String]):Unit={

  }
/* Find the sum of all even numbers from 1 to 20 using a "while" loop.
  Print the pattern:

  *
  **
  ***
  ****
        */

             var sum = 0
             var i = 1
            while(i<20) {
              if(i%2 ==0)
              sum = sum +i
              i=i+1
            }
              println(sum)
             for(i<- 0 to 4) {
               for(j<- 1 to i){
                 print("*")
               }
               println()
             }


}
