fun main() {
    val input = readLine()!!.lowercase()
    print(
        if (input.contains("the")) input.substringBefore("the").length else -1
    )
}
