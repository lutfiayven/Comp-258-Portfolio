/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258.review;

/**
 *
 * @author 13065
 */
public class ChequingAccount extends BankAccount {
    private float overdraftPenalty;
    private float overdraftLimit;
    
    public ChequingAccount() {
       
    }

    public ChequingAccount(float overdraftPenalty, float overdraftLimit) {
        this.overdraftPenalty = overdraftPenalty;
        this.overdraftLimit = overdraftLimit;
    }

    public ChequingAccount(float overdraftPenalty, float overdraftLimit, int accountNo, float balance, Customer customerAccount) {
        super(accountNo, balance, customerAccount);
        this.overdraftPenalty = overdraftPenalty;
        this.overdraftLimit = overdraftLimit;
    }

    public float getOverdraftPenalty() {
        return overdraftPenalty;
    }

    public void setOverdraftPenalty(float overdraftPenalty) {
        this.overdraftPenalty = overdraftPenalty;
    }
    
    public void setOverdraftLimit(float overdraftLimit){
        this.overdraftLimit = overdraftLimit;
    }
    
    // function to withraw from chequing account
    // float inAmount - amount to be withdrawn
    @Override
    public void withdraw(float inAmount){
        float balance  = getBalance();
        
        if (inAmount <= balance){
            setBalance(balance - inAmount);
        }
        else {
            // amount to be withdrawn including overdraft penalty since its more than the balance
            float totalSubtraction = inAmount + overdraftPenalty;
            // account balance including overdraft limit
            float totalBalance = balance + overdraftLimit;
            
            if (totalSubtraction <= totalBalance) {
                setBalance(balance - (inAmount + overdraftPenalty));
            }
            else {
                System.out.println("The account does not have enough money to complete the transaction");
            }
        }
        
    }
}
