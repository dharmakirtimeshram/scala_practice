object Que_23_of_31 {
  def main(args:Array[String]):Unit={

  }

/* Eligibility for Discount OR Membership Benefits:
  Create a Scala program to check if a customer is eligible for a discount (purchase amount greater
  than 200) or qualifies for membership benefits (loyalty card available).
  Sample Data:
  Purchase Amount: 180
  Loyalty Card: true            */

     val purchase_amount = 180
     val Loyalti_card = true

         if(purchase_amount >200 || Loyalti_card ==true)
         {
           println("Customer is eligible for discount")
         }
         else
         {
           println("Customer is not eligible for discount")
         }







}
