/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258.review;

/**
 *
 * @author 13065
 */
public class Person {
    private String firstName;
    private String lastName;
    private char middleInit;

    public Person() {
        
    }

    public Person(String firstName, String lastName, char middleInit) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleInit = middleInit;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == "") {
            this.firstName = "Me";
        } else {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == "") {
            this.lastName = "Anon";
        } else {
            this.lastName = lastName;
        }
    }

    public char getMiddleInit() {
        return middleInit;
    }

    public void setMiddleInit(char middleInit) {
        this.middleInit = middleInit;
    }
    
    public String getFullName(){
        //return full name;
        return String.format("%s,%s %c", lastName, firstName, middleInit);
    }
}
