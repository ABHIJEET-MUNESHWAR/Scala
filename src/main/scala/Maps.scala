/**
  * Created using IntelliJ IDEA.
  * Author:  abhijeet,
  * Date:    04/11/18,
  * Time:    9:07 AM
  */
object Maps {
  def main(args: Array[String]): Unit = {
    val employees = Map("Manager" -> "Sourabh", "Secretary" -> "Sue")
    if (employees.contains("Manager")) {
      printf("Manager: %s\n", employees("Manager"))
    }

    val customers = collection.mutable.Map(100 -> "Paul Smith", 101 -> "ally Smith")
    printf("Customer 1: %s\n", customers(100))

    customers(100) = "Tom Hanks"

    customers(102) = "Megan Swift"

    for ((k, v) <- customers) {
      printf("%d : %s\n", k, v)
    }

  }
}
