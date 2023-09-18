class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var answer = arrayOf(0, 0)
        for(i in sizes.indices){
            if(sizes[i][0] > answer[0]){
                answer[0] = sizes[i][0]
            }
            if(sizes[i][1] > answer[0]){
                answer[0] = sizes[i][1]
            }
        }
        for(i in sizes.indices){
            if(sizes[i][0] > sizes[i][1]){
                if(sizes[i][1] > answer[1]){
                    answer[1] = sizes[i][1]
                }
            }else{
                if(sizes[i][0] > answer[1]){
                    answer[1] = sizes[i][0]
                }
            }
        }
        return answer[0] * answer[1]
    }
}