object Que_10 {
  def main(args:Array[String]):Unit={

  }

//Check if a number is prime using a "while" loop.

              val num =12
              var i = 1
              var fact_sum = 0
              while(i<=num){
                  if(num%i==0)
                  fact_sum=fact_sum+1
                  i=i+1
              }
                if(fact_sum==2){
                  println(num +" - Prime number")
                }
                else{
                  println(num+" - Not prime")
                }





}
