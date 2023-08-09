class Solution {
    fun solution(board: Array<IntArray>): Int {
        var answer: Int = 0
        var zone = board
        for (row in board.indices) {
            for (col in board.indices) {
                if (board[row][col] == 1) {
                    for (k in 0..7) {
                        if (row > 0 && col > 0 && zone[row - 1][col - 1] == 0) {
                            zone[row - 1][col - 1] = 2
                        } else if (row > 0 && zone[row - 1][col] == 0) {
                            zone[row - 1][col] = 2
                        } else if (row > 0 && col < zone.size - 1 && zone[row - 1][col + 1] == 0) {
                            zone[row - 1][col + 1] = 2
                        } else if (col > 0 && zone[row][col - 1] == 0) {
                            zone[row][col - 1] = 2
                        } else if (col < zone.size - 1 && zone[row][col + 1] == 0) {
                            zone[row][col + 1] = 2
                        } else if (row < zone.size - 1 && col > 0 && zone[row + 1][col - 1] == 0) {
                            zone[row + 1][col - 1] = 2
                        } else if (row < zone.size - 1 && zone[row + 1][col] == 0) {
                            zone[row + 1][col] = 2
                        } else if (row < zone.size - 1 && col < zone.size - 1 && zone[row + 1][col + 1] == 0) {
                            zone[row + 1][col + 1] = 2
                        }
                    }
                }
            }
        }
        for (row in zone) {
            for (element in row) {
                if (element == 0) {
                    answer++
                }
            }
        }
        return answer
    }
}