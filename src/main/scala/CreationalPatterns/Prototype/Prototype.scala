package CreationalPatterns.Prototype

abstract case class Prototype(name: String) {

  override def clone(): Prototype = super.clone().asInstanceOf[Prototype]
  def execute()

}
