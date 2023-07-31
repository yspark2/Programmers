class Solution {
    fun solution(my_string: String): String {
        var answer = ""
        var mutableList = mutableListOf<String>()
        for(idx in 0 until my_string.length){
            answer = my_string[idx].toString()
            if(!mutableList.contains(answer)){
                mutableList.add(answer)
            }
        }
        answer = ""
        mutableList.forEach { it ->
            answer += it
        }
        return answer
    }
}