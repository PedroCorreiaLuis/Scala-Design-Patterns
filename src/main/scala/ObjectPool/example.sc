import ObjectPool.ComplexPool
import ObjectPool.ComplexPool

//@Singleton
val pool = new ComplexPool

val obj = pool.giveObject()
obj
pool.queue.isEmpty
pool.takeObject(obj)
pool.queue.isEmpty
pool.queue
