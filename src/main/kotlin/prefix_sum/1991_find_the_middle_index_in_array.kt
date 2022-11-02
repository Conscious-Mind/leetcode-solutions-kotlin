package prefix_sum

fun main() {
    val start = System.currentTimeMillis()
    val nums = intArrayOf(1, 7, 3, 6, 5, 6)
    println(findMiddleIndex(nums))
    println((System.currentTimeMillis() - start))
}

private fun findMiddleIndex(nums: IntArray): Int {
    var leftSum = 0
    val map = mutableMapOf<Int, Int>()
    for (i in nums.indices) {
        map.putIfAbsent(leftSum * 2 + nums[i], i)
        leftSum += nums[i]
    }
    return map.getOrDefault(leftSum, -1)
}