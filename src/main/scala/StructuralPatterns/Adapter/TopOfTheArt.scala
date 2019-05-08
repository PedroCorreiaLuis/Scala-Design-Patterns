package StructuralPatterns.Adapter

case class TopOfTheArt(id: Int, codes: String, priority: Int){

  def calculateNextCode(id: Int, codes: String, priority: Int): Char = {
    codes match {
      case list if list.length >= priority => list(priority)
      case _ => 'A'
    }
  }
}
