/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linklist;

/**
 *
 * @author Ravindra
 */
public class StackLinkList {
    private Node head;
    public void push(int data)
    {
        if(head==null)
        {
            head=new Node(data);
        }
        else{
            Node newNode = new Node(data);
            newNode.next=head;
            head=newNode;
        }
        System.out.println("Push data "+data+" in stack.");
    }
    public void pop()
    {
        if(head==null)
        {
            System.out.println("Stack is empty.");
        }
        else
        {
            System.out.println("Pop data "+head.data+" from stack.");
            head=head.next;
        }
    }
    public void top()
    {
        if(head==null)
        {
            System.out.println("Stack is empty.");
        }
        else
        {
            System.out.println("Top node on the stack is "+head.data);
        }
    }
    public void print()
    {
        if(head==null)
        {
            System.out.println("Stack is empty.");
        }
        else
        {
            Node p=head;
            while(p!=null)
            {
                System.out.print(p.data+"| ");
                p=p.next;
            }
            System.out.println();
        }
    }
    public boolean isEmpty()
    {
        return (head==null);
    }
    public static void main(String[] args)
    {
        StackLinkList sll=new StackLinkList();
        sll.push(3);
        sll.top();
        sll.push(4);
        sll.push(6);
        sll.push(7);
        sll.print();
        sll.pop();
        sll.print();
        sll.top();
    }
    
}
