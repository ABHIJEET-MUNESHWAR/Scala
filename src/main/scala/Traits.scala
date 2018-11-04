/**
  * Created using IntelliJ IDEA.
  * Author:  abhijeet,
  * Date:    04/11/18,
  * Time:    10:42 PM
  */
object Traits {
  def main(args: Array[String]): Unit = {
    val superman = new SuperHero("SuperMan")
    println(superman.fly)
    println(superman.hitByBullet)
    println(superman.ricochet(2500))
  }

  trait Flyable {
    def fly: String
  }

  trait BulletProof {
    def hitByBullet: String

    def ricochet(startSpeed: Double): String = {
      "The bullet rocochet at a speed of %.1f/sec".format(startSpeed * 0.75)
    }
  }

  class SuperHero(val name: String) extends Flyable with BulletProof {
    def fly = "%s flys through the air".format(this.name)

    def hitByBullet = "The bullet bounces off of %s".format(this.name)
  }

}
