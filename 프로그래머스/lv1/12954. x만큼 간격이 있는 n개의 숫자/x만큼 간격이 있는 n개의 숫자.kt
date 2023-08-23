class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var answer = LongArray(n)
        if(n != 0 || x != 0){
            for(i in 0 until n){
            answer[i] = (i + 1) * x.toLong()              
            }               
        }else{
            return answer
        }        
        return answer
    }
}