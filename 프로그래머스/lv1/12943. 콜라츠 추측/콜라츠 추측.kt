class Solution {
    fun solution(num: Int): Int {
        var answer = 0
        var temp = num.toLong()
        while(true){
            if(answer == 0 && num == 1){
                return 0
            }            
            answer++            
            if(temp % 2 == 0L){
                temp /= 2
            }else{
                temp = (temp * 3) + 1
            }
            
            if(temp == 1L){
                return answer
            }else if(answer == 500){
                return -1
            }
        }
    }
}