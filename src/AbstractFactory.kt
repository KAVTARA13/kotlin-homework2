class AbstractFactory {
    fun create(type: String): Any?{
        return when (type) {
            "Car" -> CarFactory()
            "Aircraft" -> AircraftFactory()
            else -> null
        }
    }
}