import StructuralPatterns.Decorator.{Directory, File, Playlist}

val directory = new Directory(None,"Directory")
val file = new File(Some(directory),"File")
val playlist = new Playlist(Some(file),"Playlist")

directory.show()
println("---")
file.show()
println("---")
playlist.show()
println("---")
