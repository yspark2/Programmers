import kotlin.math.abs
class Solution {
    fun solution(dots: Array<IntArray>): Int {
        var x: Int = 0
        var y = 0
        for (i in 0 until dots.size - 1) {
            for (j in i + 1..dots.size - 1) {
                if (y == 0 && dots[i][0] == dots[j][0]) {
                    x = dots[i][0]
                    y = abs(dots[i][1] - dots[j][1])
                } else if (dots[i][0] == dots[j][0]) {
                    x = abs(x - dots[j][0])
                }
            }
        }
        return x * y
    }
}