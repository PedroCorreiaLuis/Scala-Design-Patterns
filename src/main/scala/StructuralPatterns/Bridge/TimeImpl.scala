package StructuralPatterns.Bridge

class TimeImpl(hour: Short, minute: Short) extends Time {
  override def show(): Unit = {
    print(s"time is $hour:$minute PM")
  }
}
