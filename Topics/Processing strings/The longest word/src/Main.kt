fun main() {
    val input = readLine()!!.split(" ").toList()
    var n = 0
    var index = 0
    for (i in input.indices) {
        if (input[i].length > n) {
            n = input[i].length
            index = i
        }
    }
    print(input[index])  
}
