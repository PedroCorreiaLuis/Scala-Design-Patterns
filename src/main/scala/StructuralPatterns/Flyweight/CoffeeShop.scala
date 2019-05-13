package StructuralPatterns.Flyweight

object CoffeeShop {
  var orders = List.empty[Order]

  def takeOrder(flavourName: String, table: Int) {
    val flavour = CoffeeFlavour(flavourName)
    val order = Order(table, flavour)
    orders = order :: orders
  }

  def service(): Unit = orders.foreach(_.serve())

  def report =
    s"total CoffeeFlavour objects made: ${CoffeeFlavour.totalCoffeeFlavoursMade}"
}
