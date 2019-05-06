package ObjectPool

import java.util.concurrent.{ BlockingQueue, LinkedBlockingDeque }

trait ObjectPool[T] {

  def createObject()
  def giveObject(): T
  def takeObject(obj: T)
  def expireObject()

  var queue: BlockingQueue[(T, Long)] = new LinkedBlockingDeque[(T, Long)]()

}

