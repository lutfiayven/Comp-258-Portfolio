/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258.review;

/**
 *
 * @author 13065
 */
public abstract class BankAccount {
    private int accountNo;
    private float balance;
    private Customer customerAccount;

    //constructors
    public BankAccount() {
        balance = 0;
    }
    
    public BankAccount(int accountNo, float balance, Customer customerAccount) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.customerAccount = customerAccount;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public Customer getCustomerAccount() {
        return customerAccount;
    }

    public void setCustomerAccount(Customer customerAccount) {
        this.customerAccount = customerAccount;
    }
    
    // allows a user to add money to the balance property
    //----------------------------------------------------
    // float inAmount - the amount to add to the balance
    public void deposit(float inAmount)
    {
        // adding inAmount to balance
        balance = balance + inAmount;
    }
    
    // withdraw function to be filled by other types of accounts
    public abstract void withdraw(float inAmount);
    
    
    public void transfer(BankAccount inAccount, float transferAmount){
        inAccount.withdraw(transferAmount);
        
        deposit(transferAmount);
    }
    
    public String toString(){
        return accountNo + ": $" + balance;
    }
}
