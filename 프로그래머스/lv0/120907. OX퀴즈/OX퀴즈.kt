class Solution {
    fun solution(quiz: Array<String>): Array<String> {
        val answer = Array(quiz.size) { "" }
        var cnt = 0
        for (element in quiz) {
            val tempArr = element.split(" ")
            for (i in tempArr.indices step 5) {
                when (tempArr[i + 1]) {
                    "+" -> {
                        if (tempArr[i].toInt() + tempArr[i + 2].toInt() == tempArr[i + 4].toInt()) {
                            answer[cnt] = "O"
                        } else {
                            answer[cnt] = "X"
                        }
                    }

                    "-" -> {
                        if (tempArr[i].toInt() - tempArr[i + 2].toInt() == tempArr[i + 4].toInt()) {
                            answer[cnt] = "O"
                        } else {
                            answer[cnt] = "X"
                        }
                    }
                }
                cnt++
            }
        }
        return answer
    }
}