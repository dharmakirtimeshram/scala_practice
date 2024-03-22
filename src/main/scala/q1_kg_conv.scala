
import scala.io.StdIn.readLine

object q1_kg_conv {
  def main(atgs:Array[String]):Unit={

  }
    //kg into gm converter

    val x = readLine("Enter Your value in kg :- " ).toInt
    def kg_gm(a:Int):Int={
      val grm = a * 1000
      grm
    }
    val gm = kg_gm(x)
    println(s"$x kg = $gm gram")

}
