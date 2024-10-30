class Student (idIn: Int, nameIn: String, courseIn: String, markIn: Double) {
    var id: Int = idIn
    var name: String = nameIn
    var course: String = courseIn
    var mark: Double = markIn

    init {
        id = idIn
        name = nameIn
        course = courseIn
        mark = markIn
    }

    override fun toString(): String {
        return "Name: $name, Course: $course, mark: $mark"
    }
}