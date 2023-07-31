class Solution {
    fun solution(rsp: String): String {
        var answer = ""
        for (idx in 0 until rsp.length) {
            var temp = rsp.substring(idx until idx + 1)
            when (temp) {
                "0" -> answer += "5"
                "2" -> answer += "0"
                "5" -> answer += "2"
            }
        }
        return answer
    }
}