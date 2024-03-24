object Que_11_of_31 {
  def main(args:Array[String]):Unit={
  }
  /* Check for Prime AND Odd Number:
    Write a Scala function to check if a given number is both a prime number and an odd number.
    Sample Data:
    Number: 17   */

  val num = 17
  var fact_sum= 0
  for(i<- 1 to num)
    if(num%i==0){
      fact_sum = fact_sum+1

    }
  //println(fact_sum)
  if(num%2 !=0 && fact_sum==2)
  {
    println(num+" - Given number is both a prime number and odd number")
  }
  else{
    println("Given number is not prime and odd")
  }

}
