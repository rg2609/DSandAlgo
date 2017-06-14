/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linklist;

/**
 *
 * @author Ravindr
 */
public class QueueLinkList {
    Node front, rear;
    public QueueLinkList()
    {
        this.front=null;
        this.rear=null;
    }
    public boolean isEmpty()
    {
        return(front==null);
    }
    public void enQueue(int data)
    {
        Node newNode= new Node(data);
        if(rear!=null)
        {
            rear.next=newNode; 
        }
        rear=newNode;
        if(front==null)
        {
            front=rear;
        }
        System.out.println("enQueue data "+data+" at rear.");
    }
    public void deQueue()
    {
        int data;
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
        }
        else{
            data=front.data;
            front=front.next;
            System.out.println("deQueue data "+data+" from front.");
        }
    }
    public void print()
    {
       if(isEmpty())
        {
            System.out.println("Queue is Empty");
        }
        else{
           Node p= front;
           while(p!=null)
           {
               System.out.print("| "+p.data+" |");
               p=p.next;
           }
           System.out.println();
       } 
    }
    public static void main(String [] args)
    {
        QueueLinkList qll=new QueueLinkList();
        qll.print();
        qll.enQueue(3);
        qll.enQueue(9);
        qll.enQueue(7);
        qll.print();
        qll.deQueue();
        qll.deQueue();
        qll.deQueue();
        qll.enQueue(5);
        qll.deQueue();
        qll.print();
    }
    
    
}
