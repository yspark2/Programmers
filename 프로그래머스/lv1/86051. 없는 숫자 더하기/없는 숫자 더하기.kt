class Solution {
    fun solution(numbers: IntArray): Int {
        var answer = 45
        for(i in numbers.indices){
            answer -= numbers[i]
        }
        return answer
    }
}