class Solution {
    fun solution(num: Int, total: Int): IntArray {
       var answer: IntArray = intArrayOf()
        var startNum = total / num
        var sum = 0
        while(true){
            for(i in 0 until num){ 
                sum += startNum + i
            }
            if(total == sum){
                for(i in 0 until num){
                    answer = answer.plus(startNum)
                    startNum++
                }
                return answer
            }else if(total < sum){  
                startNum--
                sum = 0
            }
        }
    }
}