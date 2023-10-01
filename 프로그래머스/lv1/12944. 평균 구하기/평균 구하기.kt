class Solution {
    fun solution(arr: IntArray): Double {
        var answer = 0
        for(i in arr.indices){
            answer += arr[i]
        }
        return answer.toDouble() / arr.size
    }
}