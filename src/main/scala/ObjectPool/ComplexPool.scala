package ObjectPool

import java.util.Date
import java.util.concurrent.{ BlockingQueue, LinkedBlockingDeque }

class ComplexPool extends ObjectPool[Complex] {

  override def createObject(): Unit = {
    queue.put(new Complex, expireDate)
  }

  override def giveObject(): Complex = {
    expireObject()

    if (queue.isEmpty) {
      createObject()
      giveObject()
    } else queue.take() match {
      case (complexObj: Complex, _: Long) => complexObj
    }

  }

  override def expireObject(): Unit = queue.removeIf {
    case (_: Complex, expireDate: Long) => expireDate <= new Date().getTime
  }

  //When the client is no longer using the object, it returns to que pool
  override def takeObject(complexObj: Complex): Unit = queue.put(complexObj, expireDate)

  private def expireDate: Long = {
    val d: Date = new Date()
    d.getTime + 60000L
  }

}

