import CreationalPatterns.Builder.{PizzaBuilder, Waiter}

val builder = new PizzaBuilder()

val waiter = new Waiter

val pizza = waiter.constructPizza("cross", "tomato sause", "lots of cheese")

println(pizza)
