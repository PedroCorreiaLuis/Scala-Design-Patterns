package StructuralPatterns.Composite

//example
object Composite {

  var compositeBuilder = new StringBuffer

  def main(args: Array[String]): Unit = {
    val music = new Directory("MUSIC")
    val scorpions = new Directory("SCORPIONS")
    val dio = new Directory("DIO")
    val track1 = new File("Don't wary, be happy.mp3")
    val track2 = new File("track2.m3u")
    val track3 = new File("Wind of change.mp3")
    val track4 = new File("Big city night.mp3")
    val track5 = new File("Rainbow in the dark.mp3")
    music.add(track1)
    music.add(scorpions)
    music.add(track2)
    scorpions.add(track3)
    scorpions.add(track4)
    scorpions.add(dio)
    dio.add(track5)
    music.ls()
  }

}
