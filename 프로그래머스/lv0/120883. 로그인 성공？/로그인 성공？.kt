class Solution {
    fun solution(id_pw: Array<String>, db: Array<Array<String>>): String {
        var answer: String = ""
        for(i in db.indices){
            if(id_pw[0] == db[i][0] && id_pw[1] == db[i][1]){
                return "login"
            }else if(id_pw[0] == db[i][0] && id_pw[1] != db[i][1]){
                return "wrong pw"
            }else{
                answer = "fail"
            }
        }
        return answer
    }
}