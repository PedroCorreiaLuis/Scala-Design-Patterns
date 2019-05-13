package StructuralPatterns.Flyweight

case class Order(tableNumber: Int, flavour: CoffeeFlavour){

  def serve(): Unit =
    println(s"Serving $flavour to table $tableNumber")
}
