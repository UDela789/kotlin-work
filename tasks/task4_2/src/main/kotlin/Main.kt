// Task 4.2: use of if and ranges

fun main() {
    // Add your code here
    print("Pizza options: a, b, c, d: ")
    val option = readln().lowercase()

    // selection
    if (option in a..d && option.length == 1 ) {
        println("Order accepted")
    } else {
        println("Invalid choice!")
    }

}
