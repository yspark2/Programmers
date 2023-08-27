class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        val answer = IntArray(commands.size)
        for(i in commands.indices){ // 0, 1, 2
            var tempArr = array.slice(commands[i][0] - 1 until commands[i][1])
            tempArr = tempArr.sorted()
            answer[i] = tempArr[commands[i][2] - 1]            
        }
        return answer
    }
}