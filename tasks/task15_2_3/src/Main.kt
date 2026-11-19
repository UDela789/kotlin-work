// Task 15.2.3: demo program

fun main() {
    // Write code to demonstrate the classes here
    val savings = SavingsAccount("holder", 1.8)

    savings.deposit(1250)

    savings.applyInterest()
    savings.applyInterest()
    savings.applyInterest()
    savings.applyInterest()
    savings.applyInterest()

    savings.withdraw(50)

    println("balance: ${savings.balance}")
}
