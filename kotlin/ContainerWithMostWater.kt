// https://leetcode.com/problems/container-with-most-water

class Solution {
    fun maxArea(height: IntArray): Int {
        var maxArea = 0
        val lenghtHeight = height.size
        var currentIndex = 0;
        var lastIndex = lenghtHeight - 1

        while (currentIndex < lastIndex) {
            val isCurrentHeightMin = height[currentIndex] < height[lastIndex]
            val minHeight = if (isCurrentHeightMin) height[currentIndex] else height[lastIndex]
            val currentArea = (lastIndex - currentIndex) * minHeight
            if (currentArea > maxArea) {
                maxArea = currentArea
            }

            if (isCurrentHeightMin) {
                currentIndex++
            } else {
                lastIndex--
            }
        }

        return maxArea
    }
}
