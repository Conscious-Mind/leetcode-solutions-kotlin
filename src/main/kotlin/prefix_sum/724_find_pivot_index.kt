package prefix_sum


fun main() {
    val nums = intArrayOf(1, 7, 3, 6, 5, 6)
    println(pivotIndex(nums))
}

//private fun pivotIndex(nums: IntArray): Int {
//    var left = 0
//    var right = 0
//
//    for (i in nums.indices) {
//        if (i == 0) {
//            left = 0
//            right = findSumBetweenIndex(i+1, nums.size, nums)
//        } else if (i == nums.size - 1) {
//            right = 0
//            left = findSumBetweenIndex(0, i, nums)
//        } else {
//            left = findSumBetweenIndex(0, i, nums)
//            right = findSumBetweenIndex(i+1, nums.size, nums)
//        }
//        if (left == right) {
//            return i
//        }
//    }
//    return  -1
//}
//
//private fun findSumBetweenIndex(start: Int, end: Int, nums: IntArray) : Int {
//    var sum = 0
//    for (i in start until end) {
//        sum += nums[i]
//    }
//    return sum
//}

//Jumping to basics maths,
//
//[1,2,10, 2, 1]
//pivot is 10, sum_left = 3, sum_right = 3.
//
//Add entire thing,
//10 + 3 + 3 = 16, which is the sum of the array itself [1+2+10+2+1]
//p + sum_left + sum_right = sum_of_array( ie 16)
//
//But if for a given pivot point, the sum_left is equal to sum_right. Therefore,
//p + sum_left + sum_left = sum_of_array
//p + sum_left * 2 = sum_of_array
//
//p is nothing but a[i]. So as a conditional check,
//sum_left*2 + a[i] == sum_of_array

private fun pivotIndex(nums: IntArray): Int {
    val sum = nums.sum()
    var leftSum = 0

    for (i in nums.indices) {
        if (leftSum * 2 + nums[i] == sum)
            return i
        else
            leftSum += nums[i]
    }
    return -1
}


