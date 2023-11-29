/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist;

/**
 *
 * @author 13065
 */
public class ListNode {
    private Object data; //the data of the list node
    public ListNode next; //the next node in the chain

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    
    
    //constructors
    public ListNode(){ }
    public ListNode(Object data){
        this.data = data;
    }
    
}
