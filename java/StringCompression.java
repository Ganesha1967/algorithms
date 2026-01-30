// https://leetcode.com/problems/string-compression

class Solution {
    public int compress(char[] chars) {
        int lengthChar = chars.length;
        int counter = 1;
        char symbol = chars[0];
        StringBuilder s = new StringBuilder();

        for (int i = 1; i < lengthChar; i++) {
            if (symbol != chars[i]) {
                s.append(symbol);

                if (counter > 1) {
                    s.append(counter); 
                }

                symbol = chars[i];
                counter = 1;
            } else {
                counter++;
            }
        }

        s.append(symbol);

        if (counter > 1) {
            s.append(counter);
        }

        int s_size = s.length();
        for (int i = 0; i < s_size; i++) {
            chars[i] = s.charAt(i);
        }

        return s_size;
    }
}
