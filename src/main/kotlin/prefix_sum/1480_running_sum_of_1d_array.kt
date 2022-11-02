package prefix_sum

fun main() {
    val start = System.currentTimeMillis()
    val nums = intArrayOf(1, 2, 3, 4)
    println(runningSum(nums).contentToString())
    println((System.currentTimeMillis() - start))

}

//private fun runningSum(nums: IntArray): IntArray {
//    val sumarray = mutableListOf<Int>()
//    var sum = 0
//
//    for (i in nums.indices) {
//        sum += nums[i]
//        sumarray.add(sum)
//    }
//    return sumarray.toIntArray()
//}

// 58%, 60%
//private fun runningSum(nums: IntArray): IntArray {
//    var prev = 0
//    for (i in nums.indices) {
//        nums[i] += prev
//        prev = nums[i]
//    }
//    return nums
//}

// 90%, 90%
//private fun runningSum(nums: IntArray): IntArray {
//    for (i in nums.indices) {
//        if (i != 0) {
//            nums[i] += nums[i-1]
//        }
//    }
//    return nums
//}

private fun runningSum(nums: IntArray): IntArray {
    return nums.runningReduce { acc, i ->  acc + i}.toIntArray()
}