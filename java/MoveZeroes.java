// https://leetcode.com/problems/move-zeroes

// стоит убрать второй цикл!!!

class Solution {
    public void moveZeroes(int[] nums) {
        int length_nums = nums.length;
        int pos_not_zero = 0;
        int counter_zero = 0;
        for (int i = 0; i < length_nums; i++) {
            if (nums[i] == 0) {
                counter_zero++;
            } else {
                nums[pos_not_zero] = nums[i];
                pos_not_zero++;
            }
        }

        for (int i = length_nums - 1; i >= length_nums - counter_zero; i--) {
            nums[i] = 0;
        }
    }
}
