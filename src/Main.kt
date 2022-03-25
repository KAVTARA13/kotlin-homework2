import kotlin.math.pow
import kotlin.math.sqrt

fun main(){
    val point = Point(-1.0,12.0);
    val point2 = Point(-1.0,8.0);
    println(point.toString())
    println(point == point2)
    println(point.symmetricalWrap().toString())
    println(point.getDistance(point2))
    CarFactory().create("Audi")?.drive()
    AircraftFactory().create("Boeing777")?.fly()
    AbstractFactory().create("Drawing")?.description()
}

class Point(private val x : Double = 0.0,private val y: Double = 0.0) {
    override fun toString():String{
       return "x = $x\ny = $y"
    }
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Point) return false
        if ((this.x === other.x) != (this.y === other.y)) return false
        return true
    }
    fun symmetricalWrap():Point{
        return Point(-x,-y)
    }
    fun getDistance(other : Point):Double{
        return sqrt((other.x-this.x).pow(2)+(other.y-this.y).pow(2))
    }
}