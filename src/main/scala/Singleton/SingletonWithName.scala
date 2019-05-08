package Singleton

case class SingletonWithName(name: String)

object SingletonWithName {
  private val instance = SingletonWithName("Singleton")
  def itsASingleton(): Unit = println("My name is " + instance.name + " and I am lonely")
}

