import Prototype._

val prototypeAlpha = new PrototypeAlpha
val prototypeBeta = new PrototypeBeta

val prototypeList = List(prototypeAlpha, prototypeBeta)

PrototypeModule.initializePrototypes(prototypeList)

PrototypeModule.createPrototype("AlphaVersion")
PrototypeModule.createPrototype("BetaVersion")
PrototypeModule.createPrototype("FinalVersion")

PrototypeModule.prototypes.foreach(_.execute())