object Scala221 {
  def maximalSquare(matrix: Array[Array[Char]]): Int = {
    if (matrix.isEmpty || matrix(0).isEmpty) 0
    else {
      val x = matrix.length
      val y = matrix(0).length
      val maxSide = math.max(x, y)
      
      // 使用find来查找第一个满足条件的边长，然后计算面积
      (maxSide to 1 by -1).find { side =>
        (0 to x - side).exists { i =>
          (0 to y - side).exists { j =>
            (for {
              k <- i until i + side
              l <- j until j + side
            } yield matrix(k)(l)).forall(_ == '1')
          }
        }
      }.map(side => side * side).getOrElse(0)
    }
  }
}