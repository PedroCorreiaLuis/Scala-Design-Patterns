package Prototype

import scala.collection.mutable.ListBuffer

object PrototypeModule {

  var prototypes: ListBuffer[Prototype] = ListBuffer.empty[Prototype]

  def addPrototype(prototype: Prototype): Unit = {
    prototypes.append(prototype)
  }

  def createPrototype(name: String): Option[Prototype] = {
    prototypes.find(_.name == name)
  }

  def initializePrototypes(prototypes: List[Prototype]): Unit = {
    prototypes.foreach(addPrototype)
  }
}
