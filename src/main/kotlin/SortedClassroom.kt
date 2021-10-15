class SortedClassroom(vararg sts : Student) : Classroom<Student>(*sts) {
    override val students: MutableList<Student>
        get() = super.students.toMutableList().sorted()

    inner class StudentSorter: Comparator<Student> {
        override fun compare(firstStudent: Student, secondStudent: Student): Int =
            if(firstStudent.averageGrade() > (secondStudent.averageGrade())) 1
            else if(firstStudent.averageGrade() < secondStudent.averageGrade()) -1
            else 0
    }

    init {
        students.addAll(sts);
    }

    override fun iterator(): Iterator<Student> {
        return super.iterator()
    }
}