fun main() {
    println("please enter the upper limit: ")
    val upper = readln().toInt()
    var total = 0

    for (n in 1..upper) {
        if (n%2 == 1) {
            total = total + n
        }
    }
    println("total:")
    println(total)
}