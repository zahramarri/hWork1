fun haveSimilarDigits(num1: Int, num2: Int): Boolean? {
    var bool: Boolean? = false
    if ((num1 in (10..99)) && (num2 in (10..99))) {
        if (((num1 / 10) == (num2 / 10)) || ((num1 / 10) == (num2 % 10)) || ((num1 % 10) == (num2 / 10)) || ((num1 % 10) == (num2 % 10))) {
            bool = true
        }
    } else {
        println("ERROR")
        bool = null
    }
    return bool
}

fun main() {
    println("Please enter TWO NUMBERS between 10 and 99.")
    val num1 = readLine().toString().toInt()
    val num2 = readLine().toString().toInt()
    println(haveSimilarDigits(num1, num2))
}