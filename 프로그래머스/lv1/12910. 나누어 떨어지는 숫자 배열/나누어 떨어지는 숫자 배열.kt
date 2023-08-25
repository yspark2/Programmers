class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var find = mutableListOf<Int>()
        for (i in arr.indices) {
            if (arr[i] % divisor == 0) {
                find.add(arr[i])
            }
        }
        if (find.size == 0) {
            find.add(-1)
            return find.toIntArray()
        } else {
            find.sort()
            return find.toIntArray()
        }
    
    }
}