package FactoryMethod

class JpegReader(image: String) extends ImageReader {

  override def getImage: DecodeImage = DecodeImage(jpegReader(image))

  def jpegReader(image: String): String = image + " jpeg"
}
