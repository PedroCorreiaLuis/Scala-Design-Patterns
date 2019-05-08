package CreationalPatterns.FactoryMethod

class GifReader(image: String) extends ImageReader {

  override def getImage: DecodeImage = DecodeImage(gfiReader(image))

  def gfiReader(image: String): String = image + " gfi"
}
