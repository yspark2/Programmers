class Solution {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0
        if(a < b) {
            for(i in a .. b) {
            answer += i
            }
        } else {
            for(i in a downTo b){
                answer += i
            }
        }
        
        return answer
    }
}