/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258.review;

/**
 *
 * @author 13065
 */
public class SavingsAccount extends BankAccount {
    private float minBalance;
    private int withdrawCount;
    
    private static float ACTIVITY_PENALTY;
    private static int ACTIVITY_LIMIT;
    
    public SavingsAccount() {
       
    }

    public SavingsAccount(float minBalance, int withdrawCount) {
        this.minBalance = minBalance;
        this.withdrawCount = withdrawCount;
    }

    public SavingsAccount(float minBalance, int accountNo, float balance, Customer customerAccount) {
        super(accountNo, balance, customerAccount);
        this.minBalance = minBalance;
        this.withdrawCount = withdrawCount;
    }

    public float getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(float minBalance) {
        this.minBalance = minBalance;
    }

    public int getWithdrawCount() {
        return withdrawCount;
    }

    public void setWithdrawCount(int withdrawCount) {
        this.withdrawCount = withdrawCount;
    }

    public static float getACTIVITY_PENALTY() {
        return ACTIVITY_PENALTY;
    }

    public static void setACTIVITY_PENALTY(float ACTIVITY_PENALTY) {
        SavingsAccount.ACTIVITY_PENALTY = ACTIVITY_PENALTY;
    }

    public static int getACTIVITY_LIMIT() {
        return ACTIVITY_LIMIT;
    }

    public static void setACTIVITY_LIMIT(int ACTIVITY_LIMIT) {
        SavingsAccount.ACTIVITY_LIMIT = ACTIVITY_LIMIT;
    }
            
    // function to withraw from savings account
    // float inAmount - amount to be withdrawn
    @Override
    public void withdraw(float inAmount){
        
        // fee if transactions exceed the activity limit
        // no fee if less than activity limit
        float fee = 0;
        
        if (getBalance() < minBalance){
            withdrawCount++;
        }
        else {
            withdrawCount = 0;
        }
        
        if (withdrawCount > ACTIVITY_LIMIT){
            fee = ACTIVITY_PENALTY;
        }
        
        if (getBalance() >= inAmount + fee){
            setBalance(getBalance() - (inAmount + fee));
        }
        else {
            System.out.println("The account does not have enough money to complete the transaction");
        }
    }
}
