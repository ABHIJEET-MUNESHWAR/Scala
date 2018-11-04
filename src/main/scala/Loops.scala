/**
  * Created using IntelliJ IDEA.
  * Author:  abhijeet,
  * Date:    03/11/18,
  * Time:    10:18 PM
  */
object Loops {
  def main(args: Array[String]): Unit = {
    var i = 0
    while (i <= 10) {
      println(i)
      i += 1
    }
    for (i <- 10 to 20) {
      println(i)
    }
    val randLetters = "abcdefghijklmnopqrstuvwxyz"
    for (i <- 0 until (randLetters.length)) {
      println(randLetters(i))
    }

    val aList = List(1, 2, 3, 4, 5)
    for (i <- aList) {
      println("List items: " + i)
    }

    val evenList = for {i <- 1 to 10
                        if (i % 2) == 0
    } yield i

    for (i <- evenList) {
      println(i)
    }

    for (i <- 1 to 5; j <- 6 to 10) {
      println("i: " + i)
      println("j: " + j)
    }

    // break & continue

    def printPrimes(): Unit = {
      val primeList = List(1, 2, 3, 5, 7, 11)
      for (i <- primeList) {
        if (i == 11) {
          return
        }
        if (i != 1) {
          println(i)
        }
      }
    }

    printPrimes()
  }
}
