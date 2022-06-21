fun decoding(str: String): String {
    val alphabets = arrayOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z')
    var newStr = str
    for (letter in str) {
        var i = 0
        var repeat = 0
        while (i < str.length) {
            if (str[i] == letter) {
                repeat++
            }
            i++
        }
        val y = (alphabets.indexOf(letter.lowercaseChar()) * repeat + 1) % 26
        if (letter.isLowerCase()) {
            newStr = newStr.replace(letter, alphabets[y])
        } else {
            newStr = newStr.replace(letter, alphabets[y].uppercaseChar())
        }    }
    return newStr
}

fun main() {
    println("Please enter a STRING.")
    val str = readLine().toString()
    println(decoding(str))
}