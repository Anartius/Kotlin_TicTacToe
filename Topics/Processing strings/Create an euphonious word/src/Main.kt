fun main() {
    val input = readLine()!!
    val vowel = charArrayOf('a', 'e', 'i', 'o', 'u', 'y')
    var c = 0
    var v = 0
    var count = 0

    for (i in input.indices) {
        if (vowel.contains(input[i])) {
            c = 0
            v++
            if (v == 3) {
                v = 1
                count++
            }
        }
        if (!vowel.contains(input[i])) {
            v = 0
            c++
            if (c == 3) {
                c = 1
                count++
            }
        }
    }
    print(count)
}
