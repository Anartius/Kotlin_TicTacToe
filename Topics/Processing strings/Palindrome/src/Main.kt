fun main() {
    val input = readLine()!!
    print(
        if (input == input.reversed()) {
            "yes"
        } else "no"
    )
}
