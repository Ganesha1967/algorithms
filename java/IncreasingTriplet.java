// https://leetcode.com/problems/increasing-triplet-subsequence/

class Solution {
    public boolean increasingTriplet(int[] nums) {
        int min = Integer.MAX_VALUE, middle = Integer.MAX_VALUE;

        for (int num : nums) {
            if (min < middle && middle < num) {
                return true;
            }    
            
            if (num > min) {
                middle = num;
            } 

            if (num < min) {
                min = num;
            }  
        }

        return false;
    }
}
