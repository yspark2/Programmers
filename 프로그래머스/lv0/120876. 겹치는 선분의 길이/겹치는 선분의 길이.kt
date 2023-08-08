class Solution {
    fun solution(lines: Array<IntArray>): Int {
        var answer = 0
        var hashMap = HashMap<Int, Int>()
        for (i in 0 until 3) {
            for (j in lines[i][0] + 1..lines[i][1]) {
                if (hashMap.containsKey(j)) {
                    hashMap[j] = hashMap[j]!!.plus(1)
                } else {
                    hashMap[j] = 1
                }
            }
        }
        hashMap.forEach { (_, value) ->
            if (value >= 2) answer++            
        }
        return answer
    }
}