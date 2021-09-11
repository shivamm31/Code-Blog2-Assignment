package SOLID.LSP

object CalArea extends App {

  /*val rectangleArea: Shape = new Rectangle(10,20)
  val squareArea: Shape = new Square
  */
  val rectangleArea = (length: Int, width: Int) => length * width
  println(rectangleArea(10, 20))

  val squareArea = (length: Int, width: Int) => length * width
  println(squareArea(10, 10))

  val rectangle = Rectangle(10, 20)
  println(rectangle.calculateArea(rectangle))
}

