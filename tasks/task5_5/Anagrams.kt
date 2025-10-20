// Task 5.1.1: anagram checking using a function
// fun anagrams(first: String, second: String): Boolean {
//     if (first.length != second.length) {
//         return false
//     }
//     val firstChars = first.lowercase().toList().sorted()
//     val secondChars = second.lowercase().toList().sorted()
//     return firstChars == secondChars
// }

infix fun (List<Char>).anagramOf(str: List<Char>) = if (this.size != str.size) false else this == str

fun main() {
    println("enter your first word: ")
    val first = readln()
    println("enter your second word: ")
    val second = readln()
    var firstWord = first.lowercase().toList().sorted()
    var secondWord = second.lowercase().toList().sorted()

    if (firstWord anagramOf secondWord) {
        println("$first and $second are anagrams!")
    }
    else {
        println("$first and $second are not anagrams")
    }
}