/**
  * Created using IntelliJ IDEA.
  * Author:  abhijeet,
  * Date:    04/11/18,
  * Time:    7:39 AM
  */

import scala.collection.mutable.ArrayBuffer

object Arrays {
  def main(args: Array[String]): Unit = {
    val favNum = new Array[Int](20)
    val friends = Array("Tina", "Heena")
    friends(0) = "Meena"
    println("Best friends: " + friends(0))
    val friends2 = new ArrayBuffer[String]()
    friends2.insert(0, "Phil")
    friends2 += "Mark"
    friends2 ++= Array("Susy", "Paul")
    friends2.insert(1, "Mike", "Sally", "Sam", "Mary", "Sue")
    for (friend <- friends2) {
      println(friend)
    }
    println("--------")
    friends2.remove(5, 4)
    for (friend <- friends2) {
      println(friend)
    }
    for (i <- 0 to (favNum.length - 1)) {
      favNum(i) = i
      println(i)
    }
    val favNum2 = for (i <- favNum) yield 2 * i
    favNum2.foreach(println)

    var favNumDiv4 = for (i <- favNum if i % 4 == 0) yield i
    favNumDiv4.foreach(println)

    var multiTable = Array.ofDim[Int](10, 10)
    for (i <- 0 to 9) {
      for (j <- 0 to 9) {
        multiTable(i)(j) = i * j
      }
    }
    for (i <- 0 to 9) {
      for (j <- 0 to 9) {
        printf("%d : %d = %d\n", i, j, multiTable(i)(j))
      }
    }

    println("Sum: " + favNum.sum)
    println("Min: " + favNum.min)
    println("Max: " + favNum.max)

    val sortedNums = favNum.sortWith(_ > _)
    println(sortedNums.deep.mkString(", "))
  }
}
