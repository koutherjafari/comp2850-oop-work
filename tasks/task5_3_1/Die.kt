// Task 5.1.2: die rolling simulation
import kotlin.random.Random
fun rollDie(sides: Int = 6) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        println("Rolling a $sides sided die...")
        val result = Random.nextInt(1, sides + 1)
        println("You rolled $result")
    }
    else {
        println("Error: cannot have a $sides-sided die")
    }
}


fun readInt(msg: String): Int {
    println(msg)
    val value = readln()
    if (value == "") {
        var sides = 0
        return sides
    }
    else {
        var sides = value.toInt()
        return sides
    }
}

fun main() {
    val sides = readInt("enter the number of sides on your die or press enter to proceed with a 6 sided die: ")
    if (sides == 0) {
        rollDie()
    }
    else {
        rollDie(sides)
    }
}