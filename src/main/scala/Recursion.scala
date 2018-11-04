/**
  * Created using IntelliJ IDEA.
  * Author:  abhijeet,
  * Date:    03/11/18,
  * Time:    11:52 PM
  */
object Recursion {
  def main(args: Array[String]): Unit = {
    def factorial(num: BigInt): BigInt = {
      if (num <= 1) {
        1
      } else {
        num * factorial(num - 1)
      }
    }

    println("Factorial of 4 = " + factorial(4))
  }
}
