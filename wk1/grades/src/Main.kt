fun main() {
    /*
    println("Please enter your grade: ")
    val sGrade = readLine()
    val degree = when (sGrade) {
        "A" -> "First"
        "B" -> "2.1"
        "C" -> "2.2"
        "D" -> "Third"
        "F" -> "Fail"
        else -> "Invalid grade $sGrade"
    }
    println("Degree awarded: $degree")
    */
    println("Please enter your percentage: ")
    val sNum = readLine()
    val nNum = sNum?.toInt() ?: 0
    val sGrade = when {
        nNum in 0..29 -> "F"
        nNum in 30..39 -> "E"
        nNum in 40..49 -> "D"
        nNum in 50..59 -> "C"
        nNum in 60..69 -> "B"
        nNum in 70..100 -> "A"
        else -> "Invalid"
    }
    println("Grade: $sGrade")
}