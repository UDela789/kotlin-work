// Task 15.2.3: SavingsAccount class

class SavingsAccount(holder: String, val rate: Double) : BankAccount(holder){

    init{
        require(rate > 0.0) {"rate not high enough"}
    }

    fun applyInterest() = deposit((balance * rate / 100).toInt())

    
}
