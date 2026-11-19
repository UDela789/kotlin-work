package comp2850.banking

class StudentAccount(holder: String, var overdraft: Int = 0): BankAccount(holder){
    
    init{
        require(overdraft in 0..100) {"Overdraft must be greater than zero"}
    }

    override fun withdraw(amount: Int){
        require(amount > 0) {"Withdrawal amount must be greater than 0"}

        require(balance - amount > overdraft) {"Insufficient funds for withdrawal"}

        balance = balance - amount
    }

    fun withdrawlsAllowed(): Boolean{
        if(balance > (overdraft * -1)){
            return true
        }else{
            return false
        }
        

    }

    override fun toString() = ("Account for ${holder}, balance = ${balance} (overdraft = ${overdraft})")



}