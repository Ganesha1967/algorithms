// https://leetcode.com/problems/find-pivot-index

class Solution {
    fun pivotIndex(nums: IntArray): Int {
        val lengthNums = nums.size;
        var leftSum = 0;
        var rightSum = 0;
        var numSum = nums.sum()

        if (leftSum == numSum - nums[0]) {
            return 0
        }

        for (i in 1..lengthNums - 1) {
            leftSum += nums[i - 1]
            rightSum = numSum - leftSum - nums[i]
            if (leftSum == rightSum) {
                return i
            }
        }

        return -1
    }
}
