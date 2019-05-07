package Prototype

class PrototypeAlpha extends Prototype("AlphaVersion") {

  override def clone(): Prototype = new PrototypeAlpha

  override def execute(): Unit = println(this.name + " does something")

}
