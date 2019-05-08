import CreationalPatterns.FactoryMethod._

val image = "image"
val format: Formats = JPEG

val reader = format match {
  case JPEG => new GifReader(image)
  case GIF =>  new JpegReader(image)
}

reader.getImage