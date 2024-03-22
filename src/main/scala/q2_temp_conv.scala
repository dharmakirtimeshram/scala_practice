import scala.io.StdIn.readLine

object q2_temp_conv {
  def main(args:Array[String]):Unit={

  }
  //  Celsius to Fahrenheit Convertion

  val x = readLine(" Enter your value in Celsius :- ").toInt
  def cel(a:Int): Int ={
    val fer = (a * 9/5)+32
    fer
  }
  val c_f = cel(x)
  println(s" $x Celsius = $c_f Fahrenheit")


}
