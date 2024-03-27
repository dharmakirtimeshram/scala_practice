//  Find Index: Given an array [3,7,1,9,5], perform a linear search to find the index of the element 9.
object array_index_9 {
  def main(args:Array[String]):Unit={
    val arr = Array(3,7,1,9,5)
    val srch_item = 9
    for(i<- 0 until arr.length){
      if(arr(i)==srch_item){
        println(s" The index of the element $srch_item is $i in a given Array.")
      }
    }

  }

}
