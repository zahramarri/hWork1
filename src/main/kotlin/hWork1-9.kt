fun main() {
    println("Please enter a NUMBER.")
    val number = readLine().toString()
    var bool = false
    if (number[0] == number[number.length - 1]) {
        bool = true
    }
    println(bool)
}