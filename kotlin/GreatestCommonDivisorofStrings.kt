// https://leetcode.com/problems/greatest-common-divisor-of-strings/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    fun gcdOfStrings(str1: String, str2: String): String {
        var result: String = ""
        val lengthStr1: Int = str1.length
        val lengthStr2: Int = str2.length

        if (lengthStr1 < lengthStr2) {
            result = str2.substring(lengthStr1, lengthStr2)
        } else {
            result = str1.substring(lengthStr2, lengthStr1)
        }

        return result
    }
}
