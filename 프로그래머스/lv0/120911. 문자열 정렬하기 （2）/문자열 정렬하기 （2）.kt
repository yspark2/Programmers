class Solution {
    fun solution(my_string: String): String {
        var answer = my_string.toCharArray()
        for(idx in 0 until answer.size){
            if(answer[idx].isUpperCase() == true){
                answer[idx] = answer[idx].toLowerCase()
            }
        }
        answer.sort()
        return String(answer)
    }
}