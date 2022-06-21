import kotlin.math.max

fun isEvenlySpaced(a: Int, b: Int, c: Int): Boolean {
    var bool = false
    val numbers = arrayOf(a, b, c)
    var large = numbers[0]
    var medium = numbers[0]
    var small = numbers[0]
    for (number in numbers) {
        if (number > large) {
            large = number
        }
    }
    for (number in numbers) {
        if (number > medium) {
            if (number == large) {
                continue
            } else {
                medium = number
            }
        }
    }
    for (number in numbers) {
        if (number != large && number != medium) {
            small = number
        }
    }
    if  ((large - medium) == (medium - small)) {
        bool = true
    }
    return bool
}

fun main() {
    println("Please enter three numbers.")
    val number1 = readLine().toString().toInt()
    val number2 = readLine().toString().toInt()
    val number3 = readLine().toString().toInt()
    println(isEvenlySpaced(number1, number2, number3))
}