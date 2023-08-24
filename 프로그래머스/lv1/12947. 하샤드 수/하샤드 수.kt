class Solution {
    fun solution(x: Int): Boolean {
        val y = x.toString()
        var temp = 0
        for(i in 0 until y.length){
            temp += y[i].digitToInt()
        }
        if(x % temp == 0){
            return true
        }else{
            return false
        }
    }
}