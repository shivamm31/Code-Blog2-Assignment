package SOLID.LSP

import sun.security.util.Length

case class Rectangle(length: Int, width: Int) extends Shape {

  override def calculateArea(rectangle: Shape): Int = length * width

}
