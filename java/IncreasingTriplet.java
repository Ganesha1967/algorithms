// https://leetcode.com/problems/increasing-triplet-subsequence/?envType=study-plan-v2&envId=leetcode-75
// ПЕРЕПИСАТЬ БЕЗ ИСПОЛЬЗОВАНИЯ КОСТЫЛЯ!!!!!!!!!!!!!!!!!!!!!!

class Solution {
    public boolean increasingTriplet(int[] nums) {
        int lengthNums = nums.length;
        int min = nums[0];
        int middle = 1000_000;

        for (int i = 1; i < lengthNums; i++) {
            if (min < middle && middle < nums[i] && middle != 1000_000) {
                return true;
            }    
            
            if (nums[i] > min) {
                middle = nums[i];
            } 

            if (nums[i] < min) {
                min = nums[i];
            }  
        }

        return false;
    }
}
