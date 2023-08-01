class Solution {
    fun solution(my_string: String): String {
        var answer = arrayListOf<Char>()
        for(idx in 0 until my_string.length){
            if(my_string[idx].isUpperCase() == true){
                answer.add(my_string[idx].toLowerCase())
            }else{
                answer.add(my_string[idx].toUpperCase())
            }
        }
        return answer.joinToString("")
    }
}