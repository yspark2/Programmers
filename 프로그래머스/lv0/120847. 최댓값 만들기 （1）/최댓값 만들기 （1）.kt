class Solution {
    fun solution(numbers: IntArray): Int {
        var sortedArr = numbers.sortedDescending()
        return sortedArr[0] * sortedArr[1]
    }
}