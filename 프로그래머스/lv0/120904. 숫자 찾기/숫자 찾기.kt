class Solution {
    fun solution(num: Int, k: Int): Int {
        var answer = 0
        val number = num.toString()
        var cnt = 0
        for(char in number){
            cnt++
            if(k == char.toString().toInt() && answer == 0){
                answer = cnt
            }
        }
        if(answer == 0){
            
            return -1
            
        }else{
            return answer
        }
    }
}