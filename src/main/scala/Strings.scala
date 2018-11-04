/**
  * Created using IntelliJ IDEA.
  * Author:  abhijeet,
  * Date:    03/11/18,
  * Time:    11:30 PM
  */
object Strings {
  def main(args: Array[String]): Unit = {
    var randSent = "I am Abhijeet"
    println("3rd Index: " + randSent(3))
    println("String length: " + randSent.length)
    println(randSent.concat(" and I work in DeepIntent."))
    println("Are stirngs equal: " + "This is sample".equals(randSent))
    println("Abhijeet starts at: " + randSent.indexOf("Abhijeet"))
    val randSentArray = randSent.toArray
    for(v <- randSentArray) {
      println(v)
    }
  }
}
