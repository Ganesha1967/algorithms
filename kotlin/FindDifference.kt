// https://leetcode.com/problems/find-the-difference-of-two-arrays

class Solution {
    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        val list1 = mutableListOf<Int>() 
        val list2 = mutableListOf<Int>() 

        for (num1 in nums1) {
            var check_equel = 0
            for (num2 in nums2) {
                if (num1 == num2) {
                    check_equel++
                } 
            }

            if (check_equel == 0 && num1 !in list1) {
                list1.add(num1)
            }
        }

        for (num2 in nums2) {
            var check_equel = 0
            for (num1 in nums1) {
                if (num1 == num2) {
                    check_equel++
                } 
            }

            if (check_equel == 0 && num2 !in list2) {
                list2.add(num2)
            }
        }

        return listOf(list1, list2)        
    }
}
