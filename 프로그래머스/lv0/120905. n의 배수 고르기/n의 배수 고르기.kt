class Solution {
    fun solution(n: Int, numlist: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        for(i in 0 until numlist.size){
            if(numlist[i] % n == 0){
                answer = answer.plus(numlist[i])
            }
        }
        return answer
    }
}