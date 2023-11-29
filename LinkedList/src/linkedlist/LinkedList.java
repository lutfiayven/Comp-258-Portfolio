/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedlist;

/**
 *
 * @author 13065
 */
public class LinkedList {

    private ListNode items; // the first item in the list (node1)
    private ListNode current; // for now, always last item in the list
    
    //Current manipulation functions
    //-----------------------------------------------------------
    public void start()
    {
        current = items;
    }
    
    // advances item in the linked list
    //---------------------------------
    // returns - true if current was able to advance, false
    //           false if current was the last item in the list
    public boolean advance()
    {
        //if current is the last item in the list, return false
        if(current.next == null)
        {
            return false;
        }
        
        current = current.next;
        return true;
    }
    
    //prints out the item in current
    public void printCurrent()
    {
        System.out.println("Current item: " + current.getData().toString());
    }
    
    //List Functions
    //-----------------------------------------------------------
    public void add(ListNode inItem)
    {
        // if the list is blank, set first item to inItem
        if(items == null)
        {
            items = inItem;
            start();
        }
        else
        {
            //set temp to be the first item in the list
            ListNode temp = items;
            //loop through until temp.next == null
            while(temp.next != null)
            {
                temp = temp.next;
            }
            
            //add new item to temp.next
            temp.next = inItem;
            
            current = inItem;
        }
    }
    
    //loop through our listnodes and print out all the data
    public void print()
    {
        if(items == null)
        {
            System.out.println("There are no items in the list");
        }
        else
        {
            // setting temp to be the first item in the list
            ListNode temp = items;
                 
            //loop through until you get to the end of the list
            while(temp != null)
            {
                //print out data
                System.out.println(temp.getData());
                
                //set temp to next item in the list
                temp = temp.next;

            }
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        
        ll.add(new ListNode("Node1 Data"));
        ll.printCurrent();
        ll.add(new ListNode("Node2 Data"));
        ll.printCurrent();
        ll.add(new ListNode("Node3 Data"));
        ll.printCurrent();
        ll.add(new ListNode("Node4 Data"));
        ll.printCurrent();
        ll.add(new ListNode("Node5 Data"));
        ll.printCurrent();
        
        System.out.println("=============================");
        
        ll.start();
        do
        {
            ll.printCurrent();
        }while(ll.advance());
        
//        System.out.println("=============================");
//        System.out.println("Printing out empty list");
//        
//        ll.print();
//        
//        System.out.println("=============================");
//        System.out.println("Printing out list with 1 item");
//        
//        ll.add(new ListNode("Node1 Data"));
//        
//        ll.print();
//        
//        System.out.println("=============================");
//        System.out.println("Printing out list with 2 items");
//        
//        ll.add(new ListNode("Node2 Data"));
//        
//        ll.print();
//        
//        System.out.println("=============================");
//        System.out.println("Printing out list with 5 items");
//        
//        ll.add(new ListNode("Node3 Data"));
//        ll.add(new ListNode("Node4 Data"));
//        ll.add(new ListNode("Node5 Data"));
//        
//        ll.print();
        
        
//        String temp = "Node1 data";
//        ListNode node1 = new ListNode(temp);
//        
//        temp = "Node2 data";
//        ListNode node2 = new ListNode(temp);
//
//        ListNode node3 = new ListNode("Node3 data");
//        
//        System.out.println("node1.data = "+ ((String)node1.data));
//        System.out.println("node2.data = "+node2.data.toString());
//        System.out.println("node3.data = "+node3.data.toString());
//        
//        System.out.println("=============================");
//        node1.next = node2;
//        System.out.println("node1.next.data = "+ node1.next.data.toString());
//        
//        System.out.println("=============================");
//        node2.next = node3;
//        
//        ListNode temp1 = node1.next;
//        ListNode temp2 = temp1.next;
//        
//        System.out.println("node1.next.next.data = "+ node1.next.next.data.toString());
//        
    }
}
