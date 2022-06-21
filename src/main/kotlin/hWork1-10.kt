fun main() {
    println("Please enter a STRING.")
    val str = readLine().toString().split("*")
    var newStr = ""
    for (word in str) {
        var newWord = ""
        when (word) {
            str[0] -> {
                var i = 0
                while (i < word.length - 1) {
                    newWord += word[i]
                    i++
                }
            }
            str[str.size - 1] -> {
                var j = 1
                while (j < word.length) {
                    newWord += word[j]
                    j++
                }
            }
            else -> {
                var k = 1
                while (k < word.length - 1) {
                    newWord += word[k]
                    k++
                }
            }
        }
        newStr += newWord
    }
    println(newStr)
}