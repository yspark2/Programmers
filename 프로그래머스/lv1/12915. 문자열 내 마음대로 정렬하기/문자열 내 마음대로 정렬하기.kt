class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        var answer = Array(strings.size){""}
        var cnt = 0
        strings.sort()
        for(i in strings.indices){
            answer[i] = strings[i].substring(n,n+1)
        }
        answer.sort()
        while(true){
            for(i in strings.indices){
                if(answer[cnt] == strings[i].substring(n,n+1) && !answer.contains(strings[i])){

                    answer[cnt] = strings[i]
                }
            }
            if(answer.size - 1 == cnt){
                return answer
            }
            cnt++
        }
    }
}