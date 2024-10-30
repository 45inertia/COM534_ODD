fun main(args: Array<String>) {
    for (i in 1..3) {
        println("Please enter your name: ")
        val sName = readln()
        println("Please enter your course: ")
        val sCourse = readln()
        println("Please enter your mark: ")
        val sMark = readln()
        val dMark = sMark.toDouble()
        val student1 = Student(i, sName, sCourse, dMark)
        println(student1)
    }
}
