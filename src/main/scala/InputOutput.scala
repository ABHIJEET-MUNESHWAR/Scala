/**
  * Created using IntelliJ IDEA.
  * Author:  abhijeet,
  * Date:    03/11/18,
  * Time:    11:04 PM
  */

import scala.io.StdIn.readLine

object InputOutput {
  def main(args: Array[String]): Unit = {
    var numberGuess = 0
    do {
      print("Guess a number: ")
      numberGuess = readLine.toInt
    } while (numberGuess != 15)
    printf("You guessed secret number %d\n", 15)
  }
}
