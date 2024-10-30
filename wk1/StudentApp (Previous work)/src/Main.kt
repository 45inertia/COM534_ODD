fun main(args: Array<String>) {
    for (i in 1..3) {
        println("Please enter your name: ")
        val name = readln()
        println("Please enter your course: ")
        val course = readln()
        println("Please enter your mark: ")
        val sMark = readln()
        val nMark = sMark.toInt() ?: 0
        val Student = Student(i, name, course, nMark)
        println(Student)
    }
}