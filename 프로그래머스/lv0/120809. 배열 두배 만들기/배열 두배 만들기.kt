class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer = numbers
        for(idx in 0 until answer.size){
            answer[idx] *= 2
        }        
        return answer
    }
}