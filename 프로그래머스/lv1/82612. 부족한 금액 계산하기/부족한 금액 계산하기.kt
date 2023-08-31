class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = 0
        for(i in 1..count){
            println(price * i)
            answer += price * i
        }
        if(money < answer){
            return answer - money
        }else{
            return 0
        }
    }
}