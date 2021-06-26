fun main() {
    val input = readLine()!!.split(" ").toList()
    val n = input[1].toInt()
    var output = ""
    if (n > input[0].length) {
        print(input[0])
        return
    }
    for (i in input[0].indices) {
        output += if (i + n < input[0].length) {
            input[0][i + n]
        } else input[0][(i + n) % input[0].length]
    }

    print(output)
}
