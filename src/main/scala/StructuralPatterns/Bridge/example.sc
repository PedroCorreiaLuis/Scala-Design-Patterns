import StructuralPatterns.Bridge.{CivilianTimeImpl, MilitaryTimeImpl, TimeImpl}

val cvTime = new CivilianTimeImpl(14,20,true)
val mltTime = new MilitaryTimeImpl(14,20,'Z')
val time = new TimeImpl(14,20)

cvTime.show()
mltTime.show()
time.show()