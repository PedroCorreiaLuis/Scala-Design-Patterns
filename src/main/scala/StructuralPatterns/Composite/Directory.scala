package StructuralPatterns.Composite

import scala.collection.mutable.ArrayBuffer


class Directory(name: String) extends AbstractFile {

  override def toString: String = name

  var files: ArrayBuffer[AbstractFile] = scala.collection.mutable.ArrayBuffer.empty[AbstractFile]

  def add(file: AbstractFile) : Unit = files.append(file)

  override def ls(): Unit = {
    println(Composite.compositeBuilder + name)
    Composite.compositeBuilder.append("   ")

    files.foreach{ file => file.ls()}
  }

}
