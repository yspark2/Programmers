class Solution {
    fun solution(numbers: String): Long {
        var answer: String = ""
        var count = 0
        while (count < numbers.length) {
            val digit =
                numbers[count].toString() + numbers[count + 1].toString() + numbers[count + 2].toString()
            when (digit) {
                "zer" -> {
                    answer += "0"
                    count += 4
                }

                "one" -> {
                    answer += "1"
                    count += 3

                }

                "two" -> {
                    answer += "2"
                    count += 3

                }

                "thr" -> {
                    answer += "3"
                    count += 5

                }

                "fou" -> {
                    answer += "4"
                    count += 4

                }

                "fiv" -> {
                    answer += "5"
                    count += 4

                }

                "six" -> {
                    answer += "6"
                    count += 3

                }

                "sev" -> {
                    answer += "7"
                    count += 5

                }

                "eig" -> {
                    answer += "8"
                    count += 5

                }

                "nin" -> {
                    answer += "9"
                    count += 4

                }
            }
        }
        return answer.toLong()
    }
}