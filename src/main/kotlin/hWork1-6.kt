fun repeat(str: String, num: Int): String? {
    var newStr : String? = ""
    if (num in 1.. str.length) {
        for (i in 1..num) {
            newStr += str.subSequence(str.length - num, str.length).toString()
        }
    } else {
        newStr = null
    }
    return newStr
}

fun main() {
    println("Please enter a STRING and a NUMBER.")
    var str = readLine().toString()
    str = str.replace(" ", "")
    val num = readLine().toString().toInt()
    println(repeat(str, num))
}