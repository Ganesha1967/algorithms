// https://leetcode.com/problems/greatest-common-divisor-of-strings/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    fun gcdOfStrings(str1: String, str2: String): String {
        var result: String = ""
        var word: String = ""    
        val lengthStr1: Int = str1.length
        val lengthStr2: Int = str2.length

        for (char in str1) {
            word += char
            val countWord: Int = word.length
            val count1: Int = str1.split(word).size - 1
            val count2: Int = str2.split(word).size - 1

            if (str1.contains(word) && str2.contains(word) && lengthStr1 == countWord * count1 && lengthStr2 == countWord * count2) {
                result = word
            }
        }

        return result
    }
}
