import kotlin.math.roundToInt
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size == 3) {
        var total: Int = args[0].toInt() + args[1].toInt() + args[2].toInt()
        var average: Double = (total/3.0)
        var mark = average.roundToInt()
        val grade = when (mark) {
            in 0..39 -> "Fail"
            in 40..69 -> "Pass"
            in 70..100 -> "Distinction"
            else -> "the marks entered are invalid, out of range"
        }
        println(grade)
    }

    else {
        println("the marks entered are invalid, please enter 3 marks")
    }
}
