package StructuralPatterns.Decorator

class Playlist(abstractFile: Option[AbstractFile], name: String) extends AbstractFile {
  override def show(): Unit = {
    abstractFile.getOrElse(new AbstractFile {}).show()
    showPlaylistName()
  }
  def showPlaylistName(): Unit = print(s"\t $name \t")
}
