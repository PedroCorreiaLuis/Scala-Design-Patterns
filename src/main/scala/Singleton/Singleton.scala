package Singleton

case class Singleton(name: String)

object Singleton {
  private val instance = Singleton("Singleton")
  def itsASingleton(): Unit = println("My name is " + instance.name + " and I am lonely")
}

