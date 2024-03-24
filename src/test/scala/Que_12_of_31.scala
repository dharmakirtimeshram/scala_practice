object Que_12_of_31 {
  def main(args:Array[String]):Unit={

  }

/* Eligibility for Discount OR Free Shipping:
  Create a Scala program to check if a customer is eligible for a discount (purchase amount greater
  than 150) or qualifies for free shipping (purchase amount greater than 100).
  Sample Data:
  Purchase Amount: 120   */

  var purchase_amount = 120
  if(purchase_amount>150 || purchase_amount >100)
  {
    println("You are eligible for free shipping")
    if(purchase_amount >150)
    {
      println("You are eligible for a discount")
    }
  }
  else{
    println("Add item for free shipping")
  }




}
