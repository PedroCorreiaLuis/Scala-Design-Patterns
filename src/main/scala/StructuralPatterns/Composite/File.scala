package StructuralPatterns.Composite

class File(name: String) extends AbstractFile {

  override def toString: String = name

  override def ls(): Unit = {
    println(Composite.compositeBuilder + name)
  }
}
