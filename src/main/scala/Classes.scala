/**
  * Created using IntelliJ IDEA.
  * Author:  abhijeet,
  * Date:    04/11/18,
  * Time:    6:27 PM
  */
object Classes {
  def main(args: Array[String]): Unit = {
    val rover = new Animal
    rover.setName("Rover")
    rover.setSound("Woof")
    printf("%s says %s\n", rover.getName(), rover.getSound())

    val whiskers = new Animal("Whiskers", "Meow")

    println(s"${whiskers.getName} with id ${whiskers.id} says ${whiskers.getSound}")

    println(whiskers.toString())

    val spike = new Dog("Spike 1", "Woof", "Grrr")
    spike.setName("Spike 2")
    println(spike.toString())

  }

  class Animal(var name: String, var sound: String) {
    this.setName(name)

    val id = Animal.newIdNum

    def getName(): String = name

    def getSound(): String = sound

    def setName(name: String): Unit = {
      if (!(name.matches(".*\\d+.*"))) {
        this.name = name;
      } else {
        this.name = "No name"
      }
    }

    def setSound(sound: String): Unit = {
      this.sound = sound
    }

    def this() {
      this("No name", "No sound")
    }

    def this(name: String) {
      this("No name", "No sound")
      this.setName(name)
    }

    override def toString(): String = {
      return "%s with ID %d says %s".format(this.name, this.id, this.sound)
    }
  }

  object Animal {
    private var idNumber = 0

    private def newIdNum = {
      idNumber += 1
      idNumber
    }
  }

  // Inheritance
  class Dog(name: String, sound: String, growl: String) extends Animal(name, sound) {
    def this() {
      this("No name", "No sound", "No growl")
    }

    def this(name: String) {
      this(name, "No sound", "No growl")
      this.setName(name)
    }

    def this(name: String, sound: String) {
      this("No name", sound, "No growl")
      this.setName(name)
      this.setSound(sound)
    }

    override def toString(): String = {
      return "%s with the ID %d says %s or %s".format(this.name, this.id, this.sound, this.growl)
    }
  }

}
