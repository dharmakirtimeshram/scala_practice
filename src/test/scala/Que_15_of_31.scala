object Que_15_of_31 {
  def main(args:Array[String]):Unit={

  }

/* Age Group Classification with AND:
  Create a Scala program to classify a person's age group. Classify them as a child (less than 13),
  teenager (between 13 and 19), and an adult (20 and above) using both logical AND and OR.
  Sample Data:
  Age: 15   */

    var age = 15
   if(age<13)
   {
     println("This is child")
   }
   else if(age>= 13 && age <= 19)
   {
       println("This is a teenager")
   }
   else if(age >=20 )
   {
     println("This is a adult person")
   }



}
