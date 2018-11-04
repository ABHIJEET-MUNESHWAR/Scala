/**
  * Created using IntelliJ IDEA.
  * Author:  abhijeet,
  * Date:    03/11/18,
  * Time:    11:39 PM
  */
object Functions {
  def main(args: Array[String]): Unit = {
    def getSum(num1: Int = 1, num2: Int = 2): Int = {
      return num1 + num2
    }

    println("5 + 4 = " + getSum(5, 4))
    println("5 + 4 = " + getSum(num2 = 5, num1 = 4))

    def sayHi(): Unit ={
      println("Hi ! How are you?")
    }
    sayHi

    def getSum2(args: Int*): Int = {
      var sum: Int = 0
      for(num <- args) {
        sum += num
      }
      sum
    }
    println("Get sum: " + getSum2(1, 2, 3, 4))
  }
}
