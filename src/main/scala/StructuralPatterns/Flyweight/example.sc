//Example based on https://en.wikipedia.org/wiki/Flyweight_pattern

import StructuralPatterns.Flyweight.CoffeeShop

CoffeeShop.takeOrder("Cappuccino", 1)
CoffeeShop.takeOrder("Latte", 1)
CoffeeShop.takeOrder("Espresso", 2)
CoffeeShop.takeOrder("Latte", 675)
CoffeeShop.takeOrder("Latte", 77)
CoffeeShop.takeOrder("Espresso", 88)
CoffeeShop.takeOrder("Espresso", 56)
CoffeeShop.takeOrder("Espresso", 3)
CoffeeShop.takeOrder("Espresso", 5)
CoffeeShop.takeOrder("Cappucino", 72)
CoffeeShop.takeOrder("Cappuccino", 100)
CoffeeShop.takeOrder("Espresso", 69)

CoffeeShop.service()
println(CoffeeShop.report)