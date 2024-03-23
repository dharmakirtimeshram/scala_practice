object Que_3 {
  def main(args:Array[String]):Unit={

  }
  //  Inverted Triangle Pattern:
  //    * * * * *
  //    * * * *
  //    * * *
  //    * *
  //    *

        for(i<- 5 to 1 by -1)
          {
            for(j<- 1 to i)
            {
              print("*  ")
            }
            println()
          }


}
