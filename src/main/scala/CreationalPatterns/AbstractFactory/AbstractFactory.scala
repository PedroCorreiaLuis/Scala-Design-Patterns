package CreationalPatterns.AbstractFactory

abstract class AbstractFactory {

  def createCPU: CPU

  def createMMU: MMU

}

object AbstractFactory {

  val enginolaFactory = new EnginolaToolkit
  val emberFactory = new EmberToolkit

  def getFactory(architecture: Architecture): AbstractFactory = {
    architecture match {
      case ENGINOLA => enginolaFactory
      case EMBER => emberFactory
    }
  }
}