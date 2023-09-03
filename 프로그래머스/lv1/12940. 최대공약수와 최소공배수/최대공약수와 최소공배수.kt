class Solution {
    fun solution(n: Int, m: Int): IntArray {
        var temp = 0
        var nn = n
        var mm = m
        if (nn < mm) {
            while (nn != 0) {
                temp = mm % nn
                mm = nn
                nn = temp
            }
            temp = mm
        } else {
            while (mm != 0) {
                temp = nn % mm
                nn = mm
                mm = temp
            }
            temp = nn
        }
        return intArrayOf(temp, (n*m) / temp)
    }
}