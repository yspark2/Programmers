class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        val row = arr1.size
        val col = arr1[0].size
        val resultArr = Array(row) { row ->
            IntArray(col) { col ->
                arr1[row][col] + arr2[row][col]
            }
        }
        return resultArr
    }
}