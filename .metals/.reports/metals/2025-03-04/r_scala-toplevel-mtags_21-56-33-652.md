error id: file:///D:/java/leetcode/hot150/src/main/scala/scala221.scala:[72..73) in Input.VirtualFile("file:///D:/java/leetcode/hot150/src/main/scala/scala221.scala", "import scala.util.boundary
import scala.util.boundary.break

object  {
  def maximalSquare(matrix: Array[Array[Char]]): Int = {
    if (matrix.isEmpty || matrix(0).isEmpty) return 0
    
    val x = matrix.length
    val y = matrix(0).length
    val maxSide = math.max(x, y)
    
    boundary {
      for (side <- maxSide to 1 by -1) {
        for {
          i <- 0 to x - side
          j <- 0 to y - side
        } {
          val isValidSquare = (for {
            k <- i until i + side
            l <- j until j + side
          } yield matrix(k)(l)).forall(_ == '1')
          
          if (isValidSquare) break(side * side)
        }
      }
      0
    }
  }
}

object Main extends App {
  val matrix = Array(Array('1', '0', '1', '0', '0'), Array('1', '0', '1', '1', '1'), Array('1', '1', '1', '1', '1'), Array('1', '0', '0', '1', '0'))
  println(Solution.maximalSquare(matrix))
}")
file:///D:/java/leetcode/hot150/src/main/scala/scala221.scala:4: error: expected identifier; obtained lbrace
object  {
        ^
#### Short summary: 

expected identifier; obtained lbrace