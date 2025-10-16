// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/?envType=study-plan-v2&envId=leetcode-75

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxNum = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > maxNum) {
                maxNum = candies[i];
            }
        }

        List<Boolean> items = new ArrayList<>();
        for (int num : candies) {
            if (num + extraCandies >= maxNum) {
                items.add(true);
            } else {
                items.add(false);
            }
        }

        return items;
    }
}
