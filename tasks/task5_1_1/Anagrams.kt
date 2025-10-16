// Task 5.1.1: anagram checking using a function
fun anagrams(first: String, second: String): Boolean {
    if (first.length != second.length) {
        return false
    }
    val firstChars = first.lowercase().toList().sorted()
    val secondChars = second.lowercase().toList().sorted()
    return firstChars == secondChars
}


fun main() {
    println("enter your first word: ")
    val first = readln()
    println("enter your second word: ")
    val second = readln()
    val result = anagrams(first, second)
    println("anagram? $result")
}