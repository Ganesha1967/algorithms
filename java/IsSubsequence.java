// https://leetcode.com/problems/is-subsequence/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public boolean isSubsequence(String s, String t) {
        int length_s = s.length();
        int length_t = t.length();

        if (length_s > length_t) {
            return false;
        } else if (length_s == 0) {
            return true;
        }

        int counter = 0;
        for (int i = 0; i < length_t; i++) {
            if (s.charAt(counter) == t.charAt(i)) {
                counter++;

                if (counter == length_s) {
                    return true;
                }
            }
        }

        return false;
    }
}
