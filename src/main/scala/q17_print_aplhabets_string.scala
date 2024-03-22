object q17_print_aplhabets_string {
  def main(args:Array[String]):Unit={

  }

  //Write a Program to print the all alphabets by using character Variable.

  var alphabet: Char = 'A'

  for(i<- 0 until 26)
  {
    print(alphabet + " ")
    alphabet = (alphabet + 1).toChar
  }



}
