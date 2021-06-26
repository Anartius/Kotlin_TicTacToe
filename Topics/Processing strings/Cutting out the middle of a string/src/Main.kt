fun main() {
    val input = readLine()!!
    val len = input.length
    println(
        if (len % 2 == 1) {
            input.substring(0, len / 2) + input.substring(len / 2 + 1)
        } else {
            input.substring(0, len / 2 - 1) + input.substring(len / 2 + 1)
        })
}
