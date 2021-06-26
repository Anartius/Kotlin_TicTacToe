fun main() {
    val input = readLine()!!
    val alphabet = mutableListOf<Char>()
    for (i in 'a'..'z') {
        alphabet.add(i)
    }
    print(
        if (alphabet.joinToString(separator = "").contains(input)) "true" else "false"
    )
}
