package StructuralPatterns.Bridge

class MilitaryTimeImpl(hour: Short, minute: Short, zone: Char) extends Time {

  override def show(): Unit = {

    zone match {
      case 'A' => print(s"time is $hour$minute GMT+1")
      case 'Z' => print(s"time is $hour$minute GMT")
      case _ => print("That timezone doesn´t exist")
    }
  }

}
