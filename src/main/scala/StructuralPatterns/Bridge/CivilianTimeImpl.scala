package StructuralPatterns.Bridge

class CivilianTimeImpl(hour: Short, minute: Short, morningPeriod: Boolean) extends Time {

  private def normalizeHour: Short = {
    Math.abs(hour - 12).toShort
  }

  override def show(): Unit = {
    if (morningPeriod) print(s"time is $normalizeHour:$minute AM")
    else print(s"time is $hour:$minute PM")
  }

}
