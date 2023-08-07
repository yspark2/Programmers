import kotlin.math.abs
class Solution {
    fun solution(keyinput: Array<String>, board: IntArray): IntArray {        
        var answer: IntArray = intArrayOf(0, 0)
        for (i in keyinput.indices) {
            when (keyinput[i]) {
                "left" -> {
                    if (board[0] / 2 > abs(answer[0]))
                        answer[0]--
                }

                "right" -> {
                    if (board[0] / 2 > abs(answer[0]))
                        answer[0]++
                }

                "down" -> {
                    if (board[1] / 2 > abs(answer[1]))
                        answer[1]--
                }

                "up" -> {
                    if (board[1] / 2 > abs(answer[1]))
                        answer[1]++
                }
            }
        }
        return answer
    }
}