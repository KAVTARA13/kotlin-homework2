interface Abstract{
    fun description()
}
class Name : Abstract{
    override fun description() {
        println("Abstract Name")
    }
}
class Drawing : Abstract{
    override fun description() {
        println("Abstract Drawing")
    }
}
class AbstractFactory {
    fun create(type: String): Abstract? {
        return when (type) {
            "Drawing" -> Drawing()
            "Name" -> Name()
            else -> null
        }
    }
}