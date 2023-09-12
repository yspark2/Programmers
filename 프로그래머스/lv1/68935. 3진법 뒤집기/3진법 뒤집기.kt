class Solution {
    fun solution(n: Int): Int {
        var ternary = ""
        var temp = n
        while(temp > 0){
            val remain = temp % 3
            ternary = remain.toString() + ternary
            temp /= 3
        }
        return ternary.reversed().toInt(3)
    }
}