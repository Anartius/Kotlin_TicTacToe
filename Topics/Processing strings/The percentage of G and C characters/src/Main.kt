fun main() {
    val input = readLine()!!
    val count = (input.count { it.toLowerCase() == 'c' } + 
            input.count { it.toLowerCase() == 'g' }).toDouble()
    print(count / input.length * 100)    
}
