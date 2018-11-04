/**
  * Created using IntelliJ IDEA.
  * Author:  abhijeet,
  * Date:    04/11/18,
  * Time:    5:00 PM
  */

object Tuples {
  def main(args: Array[String]): Unit = {
    var tupleMerge = (103, "Thomas", 10.25)
    printf("%s ows us %.2f\n", tupleMerge._2, tupleMerge._3)

    tupleMerge.productIterator.foreach { i => println(i) }
    println(tupleMerge.toString())
  }
}
