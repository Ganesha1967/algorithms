// https://leetcode.com/problems/can-place-flowers/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int counter = 0;
        int lengthFlowerbed = flowerbed.length;

        for (int i = 0; i < lengthFlowerbed; i++) {
            if (flowerbed[i] == 0) {
                if (((i == 0) || (flowerbed[i - 1] == 0)) && ((i == lengthFlowerbed - 1) || (flowerbed[i + 1] == 0))) {
                    counter++;
                    flowerbed[i] = 1;
                    i++;
                }
            }
        }

        return n <= counter;
    }
}
