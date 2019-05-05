package Builder

  class PizzaBuilder(dought: Option[String] = None, sauce: Option[String] = None, topping: Option[String] = None) {

  def createPizza: Pizza = {

    Pizza(dought.getOrElse(""), sauce.getOrElse(""), topping.getOrElse(""))

  }

  def addDought(dought: String): PizzaBuilder = {
    new PizzaBuilder(Some(dought), sauce, topping)
  }

  def addSauce(sauce: String): PizzaBuilder = {
    new PizzaBuilder(dought, Some(sauce), topping)
  }

  def addTopping(topping:String):PizzaBuilder = {
    new PizzaBuilder(dought, sauce, Some(topping))
  }

}
