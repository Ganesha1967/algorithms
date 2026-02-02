// https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length
// переписать с меньшим количеством if!!!

class Solution {
    fun maxVowels(s: String, k: Int): Int {
        var counter_vowels = 0
        var max_length = 0
        val length_s = s.length
        val vowels = "aeiou"

        for (i in 0 until length_s) {
            val ch = s[i]

            if (ch in vowels) {
                counter_vowels++
            }

            if (i >= k && s[i - k] in vowels) {
                counter_vowels--
            }

            if (counter_vowels > max_length) {
                max_length = counter_vowels
            }

            if (max_length == k) {
                return k
            }
        }

        return max_length
    }
}
