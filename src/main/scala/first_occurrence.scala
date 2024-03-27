import scala.util.control.Breaks
import scala.util.control.Breaks._

object first_occurrence {
  def main(args:Array[String]):Unit={
  }

//First Occurrence:
  //Determine the index of the first occurrence of the number 5 in the array [5,2,8,5,9] using linear search.
    val arr = Array(5,2,8,5,9)
    val check_num = 5
    val loop = new Breaks
    loop.breakable {
      for (i <- 0 until arr.length) {
        if (arr(i) == check_num) {
          println(s"$i - Is the index of first occurrence of the number $check_num in the array.")
          loop.break()
        }
      }
    }








}
