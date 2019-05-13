package StructuralPatterns.Flyweight

class CoffeeFlavour private (val name: String){
  override def toString = s"CoffeeFlavour($name)"
}

object CoffeeFlavour {
  import scala.collection.mutable
  import scala.ref.WeakReference
  private val cache = mutable.Map.empty[String, ref.WeakReference[CoffeeFlavour]]

  def apply(name: String): CoffeeFlavour = synchronized {
    cache.get(name) match {
      case Some(WeakReference(flavour)) => flavour
      case _ =>
        val newFlavour = new CoffeeFlavour(name)
        cache.put(name, WeakReference(newFlavour))
        newFlavour
    }
  }

  def totalCoffeeFlavoursMade: Int = cache.size
}
