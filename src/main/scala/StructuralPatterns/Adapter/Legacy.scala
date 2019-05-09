package StructuralPatterns.Adapter

case class Legacy(id: Int, codes: List[Char], priority: Short) {

  def calculateNextCode(id: Int, codes: List[Char], priority: Short): Char = {
    codes match {
      case list if list.length >= priority => list(priority)
      case _ => 'A'
    }
  }
}
