import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.File

//@Suppress("unused")
class WordleTest ({
    "checking if the word entered is valid" {
        isValid("hello") shouldBe true
        isValid("heys") shouldBe false
        isValid("hellos") shouldBe false
    }
    "checking if list of strings was created" {
        var tfile = File("tfile.txt")
        tfile.writeText("apples\nbanana\ncarrot\ngrapes\nkiwi\n")
        readWordList("tifle.txt") shouldBe mutableListOf("apples", "banana", "carrot", "grapes", "kiwi")
    }
    "checking what happens with an empty text file" {
        var tfile = File("tfile.txt")
        tfile.writeText("")
        readWordList("tfile.txt") shouldbe mutableListOf()
    }
    "checking random word picker actually picks a word in the list" {
        var tlist = mutableListOf("apples", "banana", "carrot", "grapes", "kiwi")
        var randomWord = pickRandomWord(tlist)
        randomWord shouldBe in tlist
    }
    "checking random word picker returns nothing if list is empty" {
        var tlist = mutableListOf<String>()
        var randomWord = pickRandomWord(tlist)
        randomWord shouldBe ""
    }
    "checks evaluate guess function when completely right" {
        var guess = "hello"
        var target = "hello"
        var checks = evaluateGuess(guess, target)
        checks shouldBe listOf(1, 1, 1, 1, 1)
    }
    "checks evaluate guess function when partially right" {
        var guess = "audio"
        var target = "audit"
        var checks = evaluateGuess(guess, target)
        checks shouldBe listOf(1, 1, 1, 1, 0)
    }
    "checks evaluate guess function when completely wrong" {
        var guess = "hello"
        var target = "audit"
        var checks = evaluateGuess(guess,target)
        checks shouldBe listOf(0, 0, 0, 0, 0)
    }
})
