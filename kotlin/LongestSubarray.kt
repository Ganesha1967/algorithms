// https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element

class Solution {
    fun longestSubarray(nums: IntArray): Int {
        val lenghtNums = nums.size
        var left = 0
        var max_counter = 0
        var counter_zero = 0
        var window_size = 0
        
        for (right in 0..lenghtNums - 1) {
            if (nums[right] == 0) {
                counter_zero++
                while (counter_zero > 1) {
                    if (nums[left] == 0) {
                        counter_zero--
                    }

                    left++
                }
            }      

            window_size = right - left
            if (window_size > max_counter) {
                max_counter = window_size
            }
        }

        return max_counter
    }
}
