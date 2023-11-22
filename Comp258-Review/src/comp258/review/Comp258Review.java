/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comp258.review;

import java.util.Scanner;

/**
 *
 * @author 13065
 */
public class Comp258Review {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Customer[] customers = new Customer[3];
        
        customers[0] = new Customer("One", "Person", 'A', 1);
        customers[1] = new Customer("Two", "Person", 'B', 2);
        customers[2] = new Customer("Three", "Person", 'C', 3);
        
        BankAccount[] accounts = new BankAccount[4];
        accounts[0] = new ChequingAccount(250, 1000, 1001, 2500, customers[0]);
        accounts[1] = new ChequingAccount(300, 1500, 1002, 3500, customers[1]);
        accounts[2] = new SavingsAccount(250, 2001, 250, customers[1]);
        accounts[3] = new SavingsAccount(250, 2002, 2500, customers[21]);
        
        Scanner input = new Scanner(System.in);
        int customerId = 0;
        do{
            System.out.print("Enter customer ID:");
            customerId = input.nextInt();
            
            for (int i = 0; i < accounts.length; i++) {
                BankAccount account = accounts[i];
         
                if (account.getCustomerAccount().getCustomerID() == customerId){
                    System.out.println(account.toString());
                }
            }
        }while(true);
    }
    
}
