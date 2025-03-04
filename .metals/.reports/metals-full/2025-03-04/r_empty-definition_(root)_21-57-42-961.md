error id: 
file:///D:/java/leetcode/hot150/src/main/scala/scala221.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
|empty definition using fallback
non-local guesses:
	 -scala/util/boundary.
	 -scala/Predef.scala.util.boundary.

Document text:

```scala
import scala.util.boundary
import scala.util.boundary.break

object Solution {
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
```

#### Short summary: 

empty definition using pc, found symbol in pc: 