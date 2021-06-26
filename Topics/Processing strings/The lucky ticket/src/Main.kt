fun main() {
    val ticket = readLine()!!.toCharArray().map { it.toString().toInt() }.toList()

    var sum1 = 0
    var sum2 = 0
    for (i in 0..2) {
        sum1 += ticket[i]
        sum2 += ticket[i + 3]
    }
    
    print(
        if (sum1 == sum2) {
            "Lucky"
        } else "Regular"
    )
}
