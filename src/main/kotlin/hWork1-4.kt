fun stringSplitter(str: String, num: Int): List<String> {
    val strWithoutSpace = str.replace(" ", "")
    var newStr = ""
    for (i in 1 .. strWithoutSpace.length) {
        newStr += strWithoutSpace.subSequence(i-1, i)
        if (i % num == 0 && i != strWithoutSpace.length) {
            newStr += " "
        }
    }
    return newStr.split(" ")
}
fun main() {
    println("Please enter a STRING and a NUMBER.")
    var str = readLine().toString()
    str = str.replace(" ", "")
    val num = readLine().toString().toInt()
    println(stringSplitter(str, num))
}
