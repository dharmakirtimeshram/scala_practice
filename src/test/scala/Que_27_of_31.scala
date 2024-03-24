object Que_27_of_31 {
  def main(rags:Array[String]):Unit={

  }

/* Check for Odd OR Prime Number:
  Write a Scala function to check if a given number is either odd or a prime number.
  Sample Data:
  Number: 11   */

   val num = 11
   var fact_sum = 0
  for(i<- 1 to num)
    if(num%i == 0){
      fact_sum = fact_sum + 1
    }
    //println(fact_sum)
  if(fact_sum==2 || num%2 !=0)
    {
      println(num+" - Number either prime or odd")
    }
  else{
    println(num+" - Number not a prime or odd")
  }



}
