error id: scala/
file:///D:/java/leetcode/hot150/src/main/scala/scala88.scala
empty definition using pc, found symbol in pc: scala/
semanticdb not found
|empty definition using fallback
non-local guesses:
	 -

Document text:

```scala
object scala88 {
    def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
        for (i <- 0 until n) {
            nums1(m + i) = nums2(i)
        }
        nums1.sorted
    }
}
```

#### Short summary: 

empty definition using pc, found symbol in pc: scala/