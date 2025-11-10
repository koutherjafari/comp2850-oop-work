fun main() {
    println("this is wordle.")
    var repeating = true
    var userGuess = ""
    var attempt = 0
    var listOfStrings = readWordList("/workspaces/comp2850-oop-work/portfolio/wordle/data/words.txt")
    var target = pickRandomWord(listOfStrings)
    println(target)
    //println(target)
    while ((repeating) && (attempt < 6)) {
        attempt = attempt + 1
        userGuess = obtainGuess(attempt)
        if (userGuess == "") {
            println("invalid input, please try again")
            repeating = true
        }
        else {
            repeating = false
        }
        var checks = evaluateGuess(userGuess, target)
        displayGuess(userGuess, checks)
        if (userGuess != target) {
            repeating = true
        }
        else {
            repeating = false
        }
    }
    if (userGuess != target) {
        println("incorrect! unfortunately you ran out of guesses!")
        println("the answer was: $target")
    }
}
