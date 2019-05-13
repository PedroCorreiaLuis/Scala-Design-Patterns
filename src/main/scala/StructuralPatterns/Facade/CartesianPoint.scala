package StructuralPatterns.Facade

case class CartesianPoint(x: Int, y: Int) {

  def move(xValue: Int, yValue: Int): CartesianPoint = CartesianPoint(x + xValue, y + yValue)

  override def toString: String = "(" + x + "," + y + ")"

}
