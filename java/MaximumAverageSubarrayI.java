// https://leetcode.com/problems/maximum-average-subarray-i/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum_nums = 0;
        for (int i = 0; i < k; i++) {
            sum_nums += nums[i];
        }
        
        double max_mid = (double)sum_nums / (double)k;
        double mid = 0;
        int length_nums = nums.length;
        for (int i = k; i < length_nums; i++) {
            sum_nums -= nums[i - k];
            sum_nums += nums[i];
            mid = (double)sum_nums / (double)k;
            
            if (mid > max_mid) {
                max_mid = mid;
            }
        }

        return max_mid;
    }
}
