fun main() {
    val input = readLine()!!.map { it.digitToInt() }.toList()
    val size = input.size
    print(
        if (input.subList(0, size / 2).sum() == input.subList(size / 2, size).sum()) {
            "YES"
        } else "NO"
    )
}
