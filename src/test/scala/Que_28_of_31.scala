object Que_28_of_31 {
  def main(args:Array[String]):Unit={

  }
/* Eligibility for Discount AND Free Shipping:
  Create a Scala program to check if a customer is eligible for a discount (purchase amount greater
  than 150) and qualifies for free shipping (purchase amount greater than 100).
  Sample Data:
  Purchase Amount: 120  */

  val amt =120
  if(amt>=100)
  {
    print("Customer is eligible for free shipping")
    if(amt>=150)
    {
      print("  and discount")
    }
  }
  else
  {
    println("Add more item for free shipping")
  }





}
