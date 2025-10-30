// https://leetcode.com/problems/find-the-highest-altitude/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int largestAltitude(int[] gain) {
        int maximum = 0;
        int number = 0;
        int length = gain.length;
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = number + gain[i];
            number = array[i];
            if (maximum < array[i]) {
                maximum = array[i];
            }
        }

        return maximum;
    }
}
