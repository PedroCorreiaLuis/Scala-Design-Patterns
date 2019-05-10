package StructuralPatterns.Decorator

class Directory(abstractFile: Option[AbstractFile], name: String) extends AbstractFile {
  override def show(): Unit = {
    abstractFile.getOrElse(new AbstractFile {}).show()
    showDirectoryName()
  }
  def showDirectoryName(): Unit = print(s"\t $name \t")
}
