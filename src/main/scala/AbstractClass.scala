/**
  * Created using IntelliJ IDEA.
  * Author:  abhijeet,
  * Date:    04/11/18,
  * Time:    10:28 PM
  */
object AbstractClass {
  def main(args: Array[String]): Unit = {
    val fang = new Wolf("Fang")
    fang.moveSpeed = 36
    println(fang.move)
  }

  abstract class Mammal(val name: String) {
    var moveSpeed: Double

    def move: String
  }

  class Wolf(name: String) extends Mammal(name) {
    var moveSpeed = 35.9

    def move = "The wolf %s runs %.2f km/hr".format(this.name, this.moveSpeed)
  }

}
