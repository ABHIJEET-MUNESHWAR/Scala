/**
  * Created using IntelliJ IDEA.
  * Author:  abhijeet,
  * Date:    04/11/18,
  * Time:    11:25 PM
  */

import scala.math._

object Closures {
  def main(args: Array[String]): Unit = {
    val log10Func = log10 _
  }

  def times3(num: Int) = num * 3

  def times4(num: Int) = num * 4

  def multIt(func: (Int) => Double, num: Int) = {
    func(num)
  }

  printf("3 * 100= %.1f\n", multIt(times3, 100))

  printf("4 * 100= %.1f\n", multIt(times4, 100))

  val divisorVal = 5

  val divisor5 = (num: Double) => num / divisorVal

  println("5 / 5 = " + divisor5(5.0))
}
