package CreationalPatterns.Builder

//aka Director
class Waiter {

  val pizzaBuilder: PizzaBuilder = new PizzaBuilder()

  def constructPizza(dought: Option[String], sauce: Option[String], topping: Option[String]): Pizza = {
    val pizzaIngredients: PizzaBuilder = pizzaBuilder.addDought(dought).addSauce(sauce).addTopping(topping)
    pizzaIngredients.createPizza
  }

}
