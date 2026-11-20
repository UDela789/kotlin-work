package comp2850.banking
import kotlin.math.abs

class StudentAccount(holder: String): BankAccount(holder){
    
    var overdraft = 0
    set(overdraft){
        require(overdraft in 0..100) {"Overdraft must be greater than zero"}
        field = overdraft
    }
        
            
    

    override fun withdraw(amount: Int){
        require(amount > 0) {"Withdrawal amount must be greater than 0"}
        require((balance - amount) > overdraft) {"Insufficient funds for withdrawal"}

        balance = balance - amount
    }

    fun withdrawalsAllowed(): Boolean {
        if(balance > -overdraft){
            return true
        }else{
            return false
        }
        

    }

    override fun toString() = ("Account for ${holder}, balance = ${balance} (overdraft = ${overdraft})")



}