/**
  * Created using IntelliJ IDEA.
  * Author:  abhijeet,
  * Date:    04/11/18,
  * Time:    11:38 PM
  */

import java.io.PrintWriter
import scala.io.Source

object FileIO {
  def main(args: Array[String]): Unit = {
    val writer = new PrintWriter("src/main/resources/test.txt")
    writer.write("Some text.\n Some mroe text")
    writer.close()

    val textFromFile = Source.fromFile("src/main/resources/test.txt", "UTF-8")

    val lineIterator = textFromFile.getLines

    for (line <- lineIterator) {
      println(line)
    }

    textFromFile.close()
  }
}
