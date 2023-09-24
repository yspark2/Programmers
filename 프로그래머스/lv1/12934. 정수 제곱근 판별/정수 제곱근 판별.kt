class Solution {
    fun solution(n: Long): Long {
        var answer: Long = 0
        while (true) {
            answer++
            if (answer * answer == n) {
                answer++
                return answer * answer
            } else if (n == answer) {
                return -1
            }
        }
    }
}