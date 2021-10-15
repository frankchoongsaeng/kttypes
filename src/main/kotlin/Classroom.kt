open class Classroom<T : Student>(vararg sts : T) : Iterable<T> {
    open val students : MutableList<T> = mutableListOf()
    init {
        for (s in sts) students.add(s)
    }

    override fun iterator(): Iterator<T> {
        return students.iterator()
    }
}