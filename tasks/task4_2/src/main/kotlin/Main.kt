// Task 4.2: use of if and ranges

fun main() {
    // Add your code here
    println("PIZZA MENU")
    println("\n(a) Margherita")
    println("(b) Meat")
    println("(a) Veg")
    println("(a) Ham")

    print("\nPizza options: a, b, c, d: ")
    val option  = readln().lowercase()

    // selection
    if (option.toString() in "a".."d" && option.length == 1) {
        println("Order accepted")
    }
    else{
        println("works")
    }

}
