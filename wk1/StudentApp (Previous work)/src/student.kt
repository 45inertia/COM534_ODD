class Student(private val id: Int, private val name: String, private val course: String, private val mark: Int) {

    // Properties (attributes)
    /*
    val name: String
    val course: String
    val mark: Int
    val id: Int

    init {
        id = idIn
        name = nameIn
        course = courseIn
        mark = markIn
    }
    */
    override fun toString(): String {
        return "id: $id, Name: $name, Course: $course, mark: $mark"
    }

}