/**
  * Created using IntelliJ IDEA.
  * Author:  abhijeet,
  * Date:    04/11/18,
  * Time:    11:48 PM
  */
object ExceptionHandling {
  def main(args: Array[String]): Unit = {
    def divideNums(num1: Int, num2: Int) = try {
      (num1 / num2)
    } catch {
      case ex: java.lang.ArithmeticException => "Can't divide by zero"
    } finally {
      // clean up after exception
    }

    println("3 / 0 = " + divideNums(3, 0))
  }
}
