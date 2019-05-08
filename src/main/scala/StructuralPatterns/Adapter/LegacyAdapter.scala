package StructuralPatterns.Adapter

class LegacyAdapter {

  def calculateNextCode(topOfTheArt: TopOfTheArt): Char = {

    val legacy: Legacy = Legacy(topOfTheArt.id,topOfTheArt.codes.toList,topOfTheArt.priority.toShort)

    legacy.calculateNextCode(legacy.id,legacy.codes,legacy.priority)
  }

}
