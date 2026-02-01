// https://leetcode.com/problems/max-number-of-k-sum-pairs

class Solution {
    fun maxOperations(nums: IntArray, k: Int): Int {
        val lenghtNums = nums.size
        var currentIndex = 0;
        var lastIndex = lenghtNums - 1
        var counter = 0

        nums.sort()

        while (currentIndex < lastIndex) {
            if (nums[currentIndex] + nums[lastIndex] == k) {
                counter++
                currentIndex++
                lastIndex--
            } else if (nums[currentIndex] + nums[lastIndex] < k) {
                currentIndex++
            } else if (nums[currentIndex] + nums[lastIndex] > k) {
                lastIndex--
            }
        }

        return counter
    }
}
