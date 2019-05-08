import CreationalPatterns.ObjectPool.ComplexPool

//@CreationalPatterns.Singleton
val pool = new ComplexPool

val obj = pool.giveObject()
obj
pool.queue.isEmpty
pool.takeObject(obj)
pool.queue.isEmpty
pool.queue
