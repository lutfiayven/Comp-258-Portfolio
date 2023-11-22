/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258.review;

/**
 *
 * @author 13065
 */
public class Customer extends Person {
    private int CustomerID;
    
    // constructors
    public Customer(){
        
    }
    
    public Customer(String firstName, String lastName, char middleInit, int CustomerID){
        //call to our inhereted class's constructor
        super(firstName, lastName, middleInit);
        this.CustomerID = CustomerID;
    }
    
    public int getCustomerID(){ 
        return CustomerID;
    }
    
    public void setCustomerID(int CustomerID) { 
        this.CustomerID = CustomerID;
    }
}
