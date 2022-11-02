package array

fun main() {
    val nums1 = intArrayOf(1, 3)
    val nums2 = intArrayOf(2, 7)

    println(findMedianSortedArrays(nums1, nums2))
}

//private fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
//    return ((nums1.reduce{acc, i -> acc + i } / (nums1.size).toDouble() ) + (nums2.reduce{acc, i -> acc + i } / (nums2.size).toDouble() )) / 2.0
//}

//private fun runningSum(nums: IntArray): Double {
//    return (nums.reduceOrNull{ acc: Int, i: Int -> acc + i }?.div(nums.size.toDouble()) ?: 0).toDouble()
//}

private fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val num1size = nums1.size
    val num2size = nums2.size
    val mergedNumbers = mutableListOf<Int>()
    var index1 = 0
    var index2 = 0

    while (index1 < num1size && index2 < num2size) {
        if (nums1[index1] < nums2[index2]) {
            mergedNumbers.add(nums1[index1++])
        } else {
            mergedNumbers.add(nums2[index2++])
        }
    }

    while (index1 < num1size) {
        mergedNumbers.add(nums1[index1++])
    }

    while (index2 < num2size) {
        mergedNumbers.add(nums2[index2++])
    }


    println(mergedNumbers.toString())
    return (median(mergedNumbers, mergedNumbers.size % 2 != 0))
}

private fun median(nums: List<Int>, isSizeOdd: Boolean): Double {
    return if (isSizeOdd) {
        nums[nums.size / 2].toDouble()
    } else {
        (nums[(nums.size-1) /2].toDouble() + nums[nums.size / 2].toDouble()) / 2
    }
}