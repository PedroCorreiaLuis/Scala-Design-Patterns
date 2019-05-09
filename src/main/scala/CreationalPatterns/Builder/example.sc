import CreationalPatterns.Builder.{PizzaBuilder, Waiter}

//val builder = new PizzaBuilder()

val waiter = new Waiter

val pizza = waiter.constructPizza(Some("dought"), Some("tomato sause"), Some("lots of cheese"))

println(pizza)
