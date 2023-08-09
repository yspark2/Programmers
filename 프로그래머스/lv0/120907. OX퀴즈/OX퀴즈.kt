class Solution {
    fun solution(quiz: Array<String>): Array<String> {
        val answer = Array(quiz.size) { "" }
        var cnt = 0
        for (element in quiz) {
            val tempArr = element.split(" ")
            for (j in tempArr.indices step 5) {
                when (tempArr[j + 1]) {
                    "+" -> {
                        if (tempArr[j].toInt() + tempArr[j + 2].toInt() == tempArr[j + 4].toInt()) {
                            answer[cnt] = "O"
                        } else {
                            answer[cnt] = "X"
                        }
                    }

                    "-" -> {
                        if (tempArr[j].toInt() - tempArr[j + 2].toInt() == tempArr[j + 4].toInt()) {
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