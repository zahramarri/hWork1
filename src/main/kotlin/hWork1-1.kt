import java.util.*

//first solution
//fun main() {
//    val sc = Scanner(System.`in`)
//    var sum = 0.0
//    var i = 0
//    while (true) {
//        println("Please enter a NUMBER.")
//        val num = sc.nextDouble()
//        if (num != 0.0 && num % 2 != 0.0) {
//            sum += num
//            i++
//        } else if (num == 0.0) {
//            if (sum != 0.0) {
//                val average = sum / i
//                println("Average of odd numbers is $average.")
//            } else {
//                println("There were no odd numbers.")
//            }
//            break
//        }
//    }
//}

//second solution
fun main() {
    println("Please enter numbers.")
    val sc = Scanner(System.`in`)
    var sum = 0.0
    var i = 0
    do {
        val number = sc.nextDouble()
        if (number % 2.0 != 0.0) {
            sum += number
            i++
        }
    } while (number != 0.0)
    if (sum != 0.0) {
        println("Average of odd numbers: " + sum / i)
    } else {
        println("There were no odd numbers.")
    }
}