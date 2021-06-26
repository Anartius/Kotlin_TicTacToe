fun main() {
    val (a, b, c, n) = readLine()!!.split(" ").map { it.toInt() }
    var password = ""
    val list = mutableListOf(a, b, c)
    var i = 0
    var ch: Char

    while (password.length < n) {
        if (list[0] == 0 && list[1] == 0 && list[2] == 0) {
            list[0] = 1
            list[1] = 1
            list[2] = 1
        }

        if (list[i % 3] != 0) {
            ch = randomCh(i % 3)
            if (password.isNotEmpty() && ch != password.last()) {
                password += ch
            } else if (password.isEmpty()) {
                password += ch
            } else continue
            list[i % 3]--
        }
        i++
    }
    print(password)
}

fun randomCh(kind: Int): Char {
    return when (kind) {
        0 -> ('A'..'Z').random()
        1 -> ('a'..'z').random()
        else -> ('0'..'9').random()
    }
}
