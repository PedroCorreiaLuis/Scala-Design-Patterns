package CreationalPatterns.Builder

class PizzaBuilder(dought: Option[String] = None, sauce: Option[String] = None, topping: Option[String] = None) {

  def createPizza: Pizza = {

    Pizza(dought.getOrElse(""), sauce.getOrElse(""), topping.getOrElse(""))

  }

  def addDought(dought: Option[String]): PizzaBuilder = {
    new PizzaBuilder(dought, sauce, topping)
  }

  def addSauce(sauce: Option[String]): PizzaBuilder = {
    new PizzaBuilder(dought, sauce, topping)
  }

  def addTopping(topping: Option[String]): PizzaBuilder = {
    new PizzaBuilder(dought, sauce, topping)
  }

}
