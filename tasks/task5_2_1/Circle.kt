// Task 5.2.1: geometric properties of circles
import kotlin.math.PI

fun circleArea(radius: Double) = PI * radius * radius
fun circlePerimeter(radius: Double) = PI * radius * 2
fun readDouble (msg: String): Double {
    println(msg)
    val radius = readln().toDouble()
    return radius
}

fun main() {
    val msg = "enter the radius: "
    val radius = readDouble(msg)
    val area = circleArea(radius)
    val perimeter = circlePerimeter(radius)
    println("the area is $area, and the permieter is $perimeter")
}