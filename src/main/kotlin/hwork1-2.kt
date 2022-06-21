import java.util.*
import kotlin.math.max

//first solution
//fun main() {
//    val arrayOfFour = arrayOf(0, 0, 0, 0)
//    val sc = Scanner(System.`in`)
//    for (i in 0..3) {
//        println("Please enter a NUMBER.")
//        val num = sc.nextInt()
//        arrayOfFour[i] = num
//    }
//    var max = arrayOfFour[0]
//    for (i in 1..3) {
//        max = max(max, arrayOfFour[i])
//    }
//    println(max)
//}

fun main() {
    val sc = Scanner(System.`in`)
    var i = 0
    var max = 0.0
    while (i <= 3) {
        println("Please enter a NUMBER.")
        val num = sc.nextDouble()
        max = if (i == 0) {
            num
        } else {
            max(num, max)
        }
        i++
    }
    println(max)
}