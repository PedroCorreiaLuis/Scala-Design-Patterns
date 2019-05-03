package Builder

//aka Director
class Waiter {

  val pizzaBuilder: PizzaBuilder = new PizzaBuilder()

  def constructPizza(dought:String, sauce: String, topping: String ): Pizza = {
    val pizzaIngridients: PizzaBuilder = pizzaBuilder.addDought(dought).addSauce(sauce).addTopping(topping)
    pizzaIngridients.createPizza
  }



}