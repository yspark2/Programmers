class Solution {
    fun solution(food: IntArray): String {
        var answer: String = ""
        var temp = 0
        for(i in 1 until food.size){
            temp = food[i] / 2
            for(j in 0 until temp){
                answer += i.toString()
            }
        }        
        return answer + "0" + answer.reversed()
    }
}