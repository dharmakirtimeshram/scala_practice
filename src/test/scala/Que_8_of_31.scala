object Que_8_of_31 {
  def main(args:Array[String]):Unit={

  }

/* Eligibility for Senior Discount OR Student Discount:
  Create a Scala program to check if a person is eligible for a senior citizen discount
   (age greater than 60) or a student discount (age less than 25).
  Sample Data:
   Age: 63     */

   val age = 63
  if(age>=60 || age<=25)
  {
    println(age +" :- Eligible for Student discount or senior citizen discount")
  }
  else
  {
    println(age +" :- Not eligible for any discount")
  }


}
