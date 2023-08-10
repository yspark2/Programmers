class Solution {
    fun solution(dots: Array<IntArray>): Int {
       for(i in dots.indices) {
           for(j in i + 1 .. 3) {
               var x1 = dots[i][0] - dots[j][0]
               var y1 = dots[i][1] - dots[j][1]
               for(k in dots.indices) {
                   if(k != i && k != j) {
                       for(l in k + 1 .. 3) {
                           if(l != i && l != j) {
                               var x2 = dots[k][0] - dots[l][0]
                               var y2 = dots[k][1] - dots[l][1]
                               
                               if(x1 * y2 == x2 * y1) {
                                   return 1
                               }
                           }
                       }
                   }
               }           
           }
       }
       return 0
    }
}