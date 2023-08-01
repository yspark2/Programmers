class Solution {
    fun solution(s1: Array<String>, s2: Array<String>): Int {
        var answer: Int = 0
        for(idx in 0 until s1.size){
            if(s2.contains(s1[idx])) answer++
        }
        return answer
    }
}