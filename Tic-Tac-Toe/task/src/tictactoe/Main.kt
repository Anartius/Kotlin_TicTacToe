package tictactoe
import java.lang.NumberFormatException

fun main() {

    val field: MutableList<MutableList<Char>> = mutableListOf(
        MutableList(9) { '-' },
        mutableListOf('|', ' ', ' ', ' ', '|'),
        mutableListOf('|', ' ', ' ', ' ', '|'),
        mutableListOf('|', ' ', ' ', ' ', '|'),
        MutableList(9) { '-' },
    )
    printField(field)

    var endOfGame = false
    var cell = mutableListOf<Int>()
    var xPlayer = true

    while (!endOfGame) {
        var correctInput = false
        while (!correctInput) {
            print("Enter the coordinates: ")
            cell = try {
                readLine()!!.split(" ").map { it.toInt() }.toMutableList()
            } catch (e: NumberFormatException) {
                println("You should enter numbers!")
                mutableListOf(1, 1)
                continue
            }
            if (cell[0] !in 1..3 || cell[1] !in 1..3) {
                println("Coordinates should be from 1 to 3!")
                continue
            }
            if ("OX".contains(field[cell[0]][cell[1]])) {
                println("This cell is occupied! Choose another one!")
                continue
            }
            correctInput = true
        }

        field[cell[0]][cell[1]] = if (xPlayer) 'X' else 'O'
        xPlayer = !xPlayer
        printField(field)
        val resultOfStep = checkWinner(field)
        if (resultOfStep != "Next step") {
            endOfGame = true
            println(resultOfStep)
        }
    }

}

fun printField(field: MutableList<MutableList<Char>>) {
    println(field[0].joinToString(separator = ""))
    for (i in 1..3) {
        println(field[i].joinToString(separator = " "))
    }
    println(field[4].joinToString(separator = ""))
}

fun checkWinner(field: MutableList<MutableList<Char>>): String {
    var xCount: Int
    var oCount: Int

    if (field[1][1] == field[2][2] && field[2][2] == field[3][3] ||
        field[3][1] == field[2][2] && field[2][2] == field[1][3]
    ) {
        if (field[2][2] == 'X' || field[2][2] == 'O') return "${field[2][2]} wins"
    }

    for (i in 1..3) {
        xCount = 0
        oCount = 0
        for (j in 1..3) {
            if (field[i][j] == 'X') xCount++
            if (field[i][j] == 'O') oCount++
        }
        if (xCount == 3) return "X wins"
        if (oCount == 3) return "O wins"
    }

    var xWin = false
    var oWin = false
    for (i in 1..3) {
        xCount = 0
        oCount = 0
        for (j in 1..3) {
            if (field[j][i] == 'X') xCount++
            if (field[j][i] == 'O') oCount++
        }
        if (xCount == 3) xWin = true
        if (oCount == 3) oWin = true
    }
    if (xWin) return "X wins"
    if (oWin) return "O wins"

    var str = ""
    for (i in 1..3) {
        str += field[i].subList(1, 4).joinToString("")
    }
    return if (str.contains(' ')) {
        "Next step"
    } else "Draw"
}