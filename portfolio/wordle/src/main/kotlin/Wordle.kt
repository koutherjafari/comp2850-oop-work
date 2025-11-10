// Implement the six required functions here
import java.io.File

fun isValid(word: String): Boolean {
    //Returns true if the given word is valid in Wordle (i.e., if it consists of exactly 5 letters)
    var valid = false
    if (word.length == 5) {
        valid = true
    }
    return valid
}

fun readWordList(filename: String): MutableList<String> {
    //Reads Wordle target words from the specified file, returning them as a list of strings
    var listOfStrings = File(filename).readLines().toMutableList()
    return listOfStrings
}

fun pickRandomWord(words: MutableList<String>): String {
    //Chooses a random word from the given list, removes that word from the list, then returns it
    if (words.isEmpty()) {
        return ""
    }
    else {
        var randomWord = words.random()
        //words.remove(randomWord)
        return randomWord
    }
    
}

//DONT NEED UNIT TESTS
fun obtainGuess(attempt: Int): String {
    //Prints a prompt using the given attempt number (e.g. "Attempt 1: "), then reads a word from stdin. The word should be returned if valid, otherwise the user should be prompted to try again.
    println("Attempt number $attempt: ")
    var userAttempt = readln()
    var looping = true
    while (looping) {
        if (isValid(userAttempt)){
            looping = false
            return userAttempt
        }
        else {
            println("try again!")
            return ""
        }
    }
    return ""
}

fun evaluateGuess(guess: String, target: String): List<Int> {
    //Compares a guess with the target word. Returns a list containing 5 integers, representing the result of comparison at each letter position. 0 indicates no match, 1 indicates a match.
    var checks = mutableListOf<Int>()
    for (i in 0..4) {
        if (guess[i] == target[i]) {
            checks.add(2)
        }
        else if (target.contains(guess[i])) {
            checks.add(1)
        }
        else {
            checks.add(0)
        }
    }
    return checks
}

//DONT NEED UNIT TESTS
fun displayGuess(guess: String, matches: List<Int>) {
    //Displays the letters of a guess that match target word, or a ‘?’ character where there is no match
    val green = "\u001b[32m"//ANSI escape code for green text colour
    val yellow = "\u001b[93m"//ANSI escape code for bright yellow text colour due to yellow not being visible enough
    val black = "\u001b[30m"//ANSI escape code for black text colour
    for (i in 0..4) {
        if (matches[i] == 2) {
            print(green + guess[i])
        }
        else if (matches[i] == 1) {
            print(yellow + guess[i])
        }
        else {
            print(black + guess[i])
        }
    }
    println(black + "")
}