import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    println("Please enter a NUMBER")
    val num = sc.nextInt()
    var factorial = 1
    for (i in 1..num) {
        factorial *= i
    }
    println(factorial)
}