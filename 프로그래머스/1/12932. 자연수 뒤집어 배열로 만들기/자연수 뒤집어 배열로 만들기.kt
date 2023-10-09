class Solution {
    fun solution(n: Long): IntArray {
        val string = n.toString()
        val answer = IntArray(string.length)
        for(i in 0 until string.length){

            answer[i] = string[i].digitToInt()
        }
        answer.reverse()
        return answer
    }
}