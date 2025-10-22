// https://leetcode.com/problems/product-of-array-except-self/?envType=study-plan-v2&envId=leetcode-75

import java.util.Arrays;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int lengthNums = nums.length;
        int prefix[] = new int[lengthNums];  
        int suffix[] = new int[lengthNums]; 
        int result[] = new int[lengthNums]; 

        prefix[0] = 1;
        for (int i = 1; i < lengthNums; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        suffix[lengthNums - 1] = 1;
        for (int i = lengthNums - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < lengthNums; i++) {
            result[i] = prefix[i] * suffix[i];
        }
        
        return result;
    }
}
