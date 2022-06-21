fun main() {
    println("Please enter TWO STRINGS.")
    val str1 = readLine().toString()
    val str2 = readLine().toString()
    var i = 0
    var j = 0
    var newStr = ""
    while (j < str2.length) {
        if (i < str1.length) {
            newStr += str1[i]
        }
        newStr += str2[j]
        i++; j++
    }
    println(newStr)
}