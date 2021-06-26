fun main() {
    val date = readLine()!!.split("-").toList()
    val newDateFormat = listOf(date[1], date[2], date[0])
    print(newDateFormat.joinToString(separator = "/"))
}
