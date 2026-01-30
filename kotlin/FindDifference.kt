// https://leetcode.com/problems/find-the-difference-of-two-arrays

class Solution {
    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        val set1 = nums1.toSet()
        val set2 = nums2.toSet()

        val res_num1 = set1 - set2;
        val res_num2 = set2 - set1;

        return listOf(res_num1.toList(), res_num2.toList())        
    }
}
