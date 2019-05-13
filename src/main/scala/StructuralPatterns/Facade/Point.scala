package StructuralPatterns.Facade

class Point(x: Int, y: Int) {

  private val cPoint = CartesianPoint(x, y)

  def move(xValue: Int, yValue: Int): CartesianPoint = cPoint.move(xValue, yValue)

  def rotate(angle: Int): PolarPoint = {
    val x = cPoint.x
    val y = cPoint.y

    val pPoint = PolarPoint(Math.sqrt(x * x + y * y), Math.atan2(y, x) * 180 / Math.PI)
    pPoint.rotate(angle)
  }

  override def toString: String = cPoint.toString

}
