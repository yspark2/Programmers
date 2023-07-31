class Solution {
    fun solution(my_string: String): IntArray {
        var answer: IntArray = intArrayOf()
        for(idx in 0 until my_string.length){
            val charValue : Char = my_string[idx]
            if(charValue.isDigit() == true){
                answer += my_string.substring(idx,idx+1).toInt()
            }
        }
        answer.sort()
        return answer
    }
}