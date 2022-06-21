fun main() {
    println("Please write a SENTENCE.")
    val str = readLine().toString()
    val words = str.split(" ")
    var newStr = ""
    for (word in words) {
        var i = word.length - 1
        var newWord = ""
        while (i >= 0) {
            newWord += word[i]
            i --
        }
        newStr += "$newWord "
    }
    println(newStr)
}