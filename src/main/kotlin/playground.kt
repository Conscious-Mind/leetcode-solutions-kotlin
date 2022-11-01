class Solution {
    fun pivotIndex(nums: IntArray): Int {
        var left = 0
        var right = 0

        for (i in nums.indices) {
            if (i == 0) {
                left = 0
                right = findSumBetweenIndex(i + 1, nums.size, nums)
            } else if (i == nums.size - 1) {
                right = 0
                left = findSumBetweenIndex(0, i, nums)
            } else {
                left = findSumBetweenIndex(0, i, nums)
                right = findSumBetweenIndex(i + 1, nums.size, nums)
            }
            if (left == right) {
                return i
            }
        }
        return -1

    }

    private fun findSumBetweenIndex(start: Int, end: Int, nums: IntArray): Int {
        var sum = 0
        for (i in start until end) {
            sum += nums[i]
        }
        return sum
    }
}