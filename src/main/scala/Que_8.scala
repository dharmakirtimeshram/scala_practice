object Que_8 {
  def main(args:Array[String]):Unit={

  }
  // butterfly pattern
  //      * *
  //      * * * *
  //      * * * * *
  //      * * * *
  //      * *

            for(i<- 2 to 4 by 2){
              for (j<- 1 to i)
              {
                print("* ")
              }
              println()
            }
             print("* " * 5)
             println()
            for(k<- 4 to 2 by -2){
              for(l<- 1 to k){
                print("* ")
              }
              println()
            }


}
