class Solution {
    fun solution(s: String): Boolean {
        if(s.length == 4 || s.length == 6){
            for(i in 0 until s.length){
            if(!s[i].isDigit()){
                return false
            
            }
       
            }            
        
        }else{
            return false
        }
        return true
    }
}