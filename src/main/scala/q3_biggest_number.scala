import scala.io.StdIn.readLine

object q3_biggest_number {
  def main(args:Array[String]):Unit={

  }
  //Find Biggest number

  val x = readLine(" Enter First Value :- ").toInt
  val y = readLine(" Enter Second  Value :- ").toInt
  val z = readLine(" Enter Third Value :- ").toInt

  if (x>y && x>z){
    println(s"$x is Biggest Number")
  }
  else if( y > x && y > z)
  {
    println(s" $y is Biggest Number")
  }
  else
  {
    println(s"$z is Biggest Number")
  }


}
