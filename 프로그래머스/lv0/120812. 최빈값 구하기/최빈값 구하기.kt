class Solution {
    fun solution(array: IntArray): Int {
        val input = array
        val hashMap = HashMap<Int, Int>()
        for(idx in 0 until input.size){
            if(!hashMap.containsKey(input[idx])){
                hashMap[input[idx]] = 1
            }else{
                hashMap[input[idx]] = hashMap[input[idx]]!!.plus(1)
            }
        }
        val sortedList = hashMap.toList().sortedByDescending { it.second }
        if (sortedList.getOrNull(0)?.second == sortedList.getOrNull(1)?.second) {
            return -1
        } else {
            val tempKey = sortedList.getOrNull(0)!!.first
            return tempKey
        }  
    }
}