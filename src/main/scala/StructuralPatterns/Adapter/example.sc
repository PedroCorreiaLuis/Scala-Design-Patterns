import StructuralPatterns.Adapter.{LegacyAdapter, TopOfTheArt}

val adapter = new LegacyAdapter()

val newClass = TopOfTheArt(1,"ABCDEFG",2)

adapter.calculateNextCode(newClass)