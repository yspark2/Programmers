class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0        
        while(true){
            answer++
            if(n % answer == 1){
                return answer
            }
        }        
    }
}