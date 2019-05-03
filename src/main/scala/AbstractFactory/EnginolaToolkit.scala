package AbstractFactory

class EnginolaToolkit extends AbstractFactory {

  def createCPU: EnginolaCPU = {
    new EnginolaCPU
  }

  def createMMU: EnginolaMMU = {
    new EnginolaMMU
  }

}
