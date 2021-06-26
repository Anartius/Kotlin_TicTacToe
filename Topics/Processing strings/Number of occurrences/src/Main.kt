fun main() {
    var string = readLine()!!
    val word = readLine()!!
    var n = 0
    
    while (string.contains(word)) {
        string = string.replaceFirst(word, "")
        n++
    }
    print(n)
}
