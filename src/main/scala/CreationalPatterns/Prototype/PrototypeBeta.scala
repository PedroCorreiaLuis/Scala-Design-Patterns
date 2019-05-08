package CreationalPatterns.Prototype

class PrototypeBeta extends Prototype("BetaVersion") {

  override def clone(): Prototype = new PrototypeBeta

  override def execute(): Unit = println(this.name + " does something else")

}
