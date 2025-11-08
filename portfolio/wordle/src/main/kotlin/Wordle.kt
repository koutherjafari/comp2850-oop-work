// Implement the six required functions here

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
    var randomWord = words.random
    words.remove(randomWord)
    return randomWord
}

//DONT NEED UNIT TESTS
fun obtainGuess(attempt: Int): String {
    //Prints a prompt using the given attempt number (e.g. "Attempt 1: "), then reads a word from stdin. The word should be returned if valid, otherwise the user should be prompted to try again.
    println("Attempt number $attempt: ")
    userAttempt = readline()
    if (userAttempt.isValid){
        return userAttempt
    }
    else {
        println("try again!")
        return ""
    }
}

fun evaluateGuess(guess: String, target: String): List<Int> {
    //Compares a guess with the target word. Returns a list containing 5 integers, representing the result of comparison at each letter position. 0 indicates no match, 1 indicates a match.
    var checks = []
    for (i in 0..4) {
        if (guess[i] == target[i]) {
            checks.append(1)
        }
        else {
            checks.append(0)
        }
    }
    return checks
}

//DONT NEED UNIT TESTS
fun displayGuess(guess: String, matches: List<Int>) {
    //Displays the letters of a guess that match target word, or a ‘?’ character where there is no match
    for (i in 0..4) {
        if (matches[i] == 1) {
            print(guess[i])
        }
        else {
            print("?")
        }
    }
    println("")
}