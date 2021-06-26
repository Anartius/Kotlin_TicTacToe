fun main() {
    val input = readLine()!!.substringAfter('?')
    val list = input.split('&').map { it.replace("=", " : ") }.toMutableList()
    for (i in list.indices) {
        if (list[i].substringAfter(": ").isEmpty()) list[i] += "not found"
        if (list[i].contains("pass")) list.add(list[i].replace("pass", "password"))
    }
    list.forEach { println(it) }
}
