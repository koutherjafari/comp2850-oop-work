fun main() {
    var valid = false
    while (valid == false) {
        println("choose your pizza: a. margarita, b. pepperoni, c. chicken, d. vegetarian")
        val choice = readln().lowercase()
        if (choice.length == 1) {
            if (choice in "a".."d") {
                println("Order accepted")
                valid = true
            }
            else {
                println("Invalid choice!")
            }
        }
        else {
            println("Invalid choice!")
        }
    }
    
}