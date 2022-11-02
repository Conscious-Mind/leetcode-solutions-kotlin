class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        return ((nums1.reduce { acc, i -> acc + i } / nums1.size) + (nums2.reduce { acc, i -> acc + i } / nums2.size)) / 2.0
    }
}