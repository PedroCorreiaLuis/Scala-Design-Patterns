import CreationalPatterns.AbstractFactory._

val factory = AbstractFactory.getFactory(EMBER)
val cpu = factory.createCPU