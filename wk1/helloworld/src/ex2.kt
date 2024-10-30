fun main() {
    println("How many times would you like to enter your name: ")
    val sNum1 = readLine()
    val nNum1 = sNum1?.toInt() ?: 0
    println("Please enter your name: ")
    val name = readLine()
    for (i in 1..nNum1) {
        println(name)
    }
}