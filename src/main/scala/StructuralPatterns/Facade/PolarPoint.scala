package StructuralPatterns.Facade

case class PolarPoint(radius: Double, angle: Double) {

  def rotate(angleValue: Int): PolarPoint = PolarPoint(radius, angle + (angleValue % 360))

  override def toString: String = "[" + radius + "@" + angle + "]"
}
