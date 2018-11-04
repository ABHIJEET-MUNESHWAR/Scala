/**
  * Created using IntelliJ IDEA.
  * Author:  abhijeet,
  * Date:    04/11/18,
  * Time:    11:11 PM
  */

import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object HigherOrderFunctionsMapsFilters {
  def main(args: Array[String]): Unit = {
    val log10Func = log10 _
    println(log10Func(1000))

    List(1000.0, 10000.0).map(log10Func).foreach(println)

    List(1, 2, 3, 4, 5).map((x: Int) => x * 50).foreach(println)

    List(1, 2, 3, 4, 5).filter(_ % 2 == 0).foreach(println)
  }
}
