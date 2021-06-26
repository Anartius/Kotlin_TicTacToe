fun main() {
    val input = readLine()!!
    var output = ""
    var n = 1

    if (input.isEmpty()) {
        print(input)
        return
    }
    
    if (input.length == 1) {
        print("${input[0]}1")
        return
    }

    for (i in 1 until input.length) {
        if (input[i] == input[i - 1]) {
            n++
        } else {
            output += "${input[i - 1]}$n"
            n = 1
        }
        if (i == input.length - 1) output += "${input[i]}$n"
    }

    print(output)
}
