// https://leetcode.com/problems/max-consecutive-ones-iii

class Solution {
    fun longestOnes(nums: IntArray, k: Int): Int {
        val lenghtNums = nums.size
        var left = 0
        var right = 0
        var max_counter = 0
        var counter_zero = 0
        var window_size = 0
        
        while (right < lenghtNums) {
            if (nums[right] == 0) {
                counter_zero++
                while (counter_zero > k) {
                    if (nums[left] == 0) {
                        counter_zero--
                    }

                    left++
                }
            }      

            window_size = right - left + 1 
            if (window_size > max_counter) {
                max_counter = window_size
            } 

            right++
        }

        return max_counter
    }
}
