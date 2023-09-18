class Solution {
    fun solution(s: String): String {
        var answer = ""
        var switch = 1
        for (i in s.indices) {
            if (s[i] == ' ') {
                switch = 1
                answer += " "
            } else if (s[i].toString() != "" && switch == 1 && !s[i].isDigit()) {
                switch = 0
                answer += s[i].toUpperCase()
            } else if (s[i].isDigit()) {
                switch = 0
                answer += s[i].toLowerCase()
            } else {
                answer += s[i].toLowerCase()
            }
        }
        
        return answer
    }
}