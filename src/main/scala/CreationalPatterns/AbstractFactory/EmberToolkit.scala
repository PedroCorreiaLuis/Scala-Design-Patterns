package CreationalPatterns.AbstractFactory

class EmberToolkit extends AbstractFactory {

  def createCPU: EmberCPU = {
    new EmberCPU
  }

  def createMMU: EmberMMU = {
    new EmberMMU
  }

}