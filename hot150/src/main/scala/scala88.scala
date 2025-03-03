import scala.collection.mutable.ArrayBuffer

object Solution {
  def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
    // 将nums2的元素复制到nums1的后半部分
    for (i <- 0 until n) {
      nums1(m + i) = nums2(i)
    }
    
    // 对整个数组进行排序
    scala.util.Sorting.quickSort(nums1)
    
    // 创建一个临时的ArrayBuffer来存储非零元素
    val temp = ArrayBuffer[Int]()
    for (value <- nums1 if value != 0) {
      temp += value
    }
    
    // 将非零元素复制回nums1
    for (i <- temp.indices) {
      nums1(i) = temp(i)
    }
    
    // 将剩余位置填充为0
    for (i <- temp.length until nums1.length) {
      nums1(i) = 0
    }
  }
}

object Main extends App {
  val nums1 = Array(1, 2, 3, 0, 0, 0)
  val m = 3
  val nums2 = Array(2, 5, 6)
  val n = 3

  Solution.merge(nums1, m, nums2, n)
  println(nums1.mkString(", "))
}
