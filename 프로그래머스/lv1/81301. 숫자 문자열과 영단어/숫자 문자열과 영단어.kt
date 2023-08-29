class Solution {
    fun solution(s: String): Int {
        var temp = ""
        var answer = ""
        for(i in s.indices){
            if(s[i].isDigit()){
                answer += s[i]
            }else{
                temp += s[i]
            }
            when(temp){
                "zero" -> {
                    answer += "0"
                    temp = ""
                }
                "one" -> {
                    answer += "1"
                    temp = ""
                }
                "two" -> {
                    answer += "2"
                    temp = ""

                }
                "three" -> {
                    answer += "3"
                    temp = ""

                }
                "four" -> {
                    answer += "4"
                    temp = ""

                }
                "five" -> {
                    answer += "5"
                    temp = ""

                }
                "six" -> {
                    answer += "6"
                    temp = ""

                }
                "seven" -> {
                    answer += "7"
                    temp = ""

                }
                "eight" -> {
                    answer += "8"
                    temp = ""

                }
                "nine" -> {
                    answer += "9"
                    temp = ""

                }
            }
        }
        return answer.toInt()
    }
}