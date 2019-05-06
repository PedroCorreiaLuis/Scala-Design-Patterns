package Builder

case class Pizza(dought: String, sauce: String, topping: String) {
  override def toString: String = dought + " " + sauce + " " + topping
}