package StructuralPatterns.Decorator

class File(abstractFile: Option[AbstractFile], name: String) extends AbstractFile {
  override def show(): Unit = {
    abstractFile.getOrElse(new AbstractFile {}).show()
    showFileName()
  }
  def showFileName(): Unit = print(s"\t $name \t")
}
