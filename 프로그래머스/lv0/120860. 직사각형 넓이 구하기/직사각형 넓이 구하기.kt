import kotlin.math.abs
class Solution {
    fun solution(dots: Array<IntArray>): Int {
        var answer: Int = 0
        var x = 0
        for (i in 0 until dots.size - 1) {
            for (j in i + 1..dots.size - 1) {
                if (x == 0 && dots[i][0] == dots[j][0]) {
                    answer = dots[i][0]
                    x = abs(dots[i][1] - dots[j][1])
                } else if (dots[i][0] == dots[j][0]) {
                    answer = abs(answer - dots[j][0])
                }
            }
        }
        return answer * x
    }
}