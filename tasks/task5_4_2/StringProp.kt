// Task 5.4.1: string extension function
val String.tooLong: Boolean get() = if (this.length > 20) true else false

fun main() {
    println("enter your word to test if it is too long: ")
    var word = readln()
    println(word.tooLong)
}