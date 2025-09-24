class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        var result = ""

        val lenWord1: Int = word1.length
        val lenWord2: Int = word2.length
        val keyMinWord: Int
        val maxNum: Int
        val minNum: Int

        if (lenWord1 > lenWord2) {
            maxNum = lenWord1
            minNum = lenWord2
            keyMinWord = 2
        } else {
            maxNum = lenWord2
            minNum = lenWord1
            keyMinWord = 1
        }

        for (i in 0 until maxNum) {
            if (minNum > i) {
                result = result + word1[i] + word2[i]
            } else {
                if (keyMinWord == 1) {
                    result += word2[i]
                } else {
                    result += word1[i]
                }

            }
        }

        return result
    }
}
