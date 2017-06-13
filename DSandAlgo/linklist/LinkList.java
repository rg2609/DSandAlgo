/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linklist;

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        next=null;
    }
}

/**
 *
 * @author Ravindr
 */
public class LinkList {
     Node first;
    public  int getLength()
    {
        Node p = first;
        int len=0;
        if(p==null)
        {
            return len;
        }
        else{
            while(p!=null)
            {
                len++;
                p=p.next;
            }
            return len;
        }
    }
    public  void insertNodeAtPosition(int data, int pos)
    {
        int len= getLength(),count=0;
        if(pos<1 && pos>len)
        {
            System.out.println("Node can't be insert at "+ pos);
        }
        else
        {
            Node newNode= new Node((data));
            if(pos==1)
            {
                newNode.next=first;
                first=newNode;
            }
            else
            {
                Node curr=first;
                while(count<pos-2){
                    curr=curr.next;
                    count++;
                }
                newNode.next=curr.next;
                curr.next=newNode;
            }
            System.out.println("Node inserted "+data+" at "+ pos+" position");
        }
        
    }
    
    public void printNode()
    {
        if(first==null)
        {
            System.err.println("No Data found");
        }
        else{
            Node curr=first;
            while(curr!=null)
            {
                System.out.print(" | "+curr.data);
                curr=curr.next;
            }
            System.out.println();
        }
    }
    public void insertAtFirst(int data)
    {
        Node newNode= new Node(data);
        if(first==null)
        {
            first=newNode;
        }
        else
        {
            newNode.next=first;
            first=newNode;
        }
        System.out.println("Node inserted "+data+" at first");
    }
    public void insertAtLast(int data)
    {
        Node newNode = new Node(data);
        Node curr= first;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=newNode;
        System.out.println("Node inserted "+data+" at last");
    }

    public void deleteNodeAt(int pos)
    {
        int len=getLength();
        if(pos<1 && pos>len)
        {
            System.out.print("Invalid position, so can not delete the node");
        }
        else
        {
            Node curr=first;
            if(pos==1)
            {
                first=first.next;
            }
            else{
                int count=0;
                while(count<pos-2)
                {
                    count++;
                    curr=curr.next;
                }
                Node p=curr.next;
                curr.next=p.next;
            }
            System.out.println("Deleted node from "+pos+" position");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkList list=new LinkList();
        list.insertAtFirst(5);
        //list.printNode();
        list.insertAtFirst(6);
        list.insertAtLast(4);
        list.insertNodeAtPosition(3, 2);        
        list.insertNodeAtPosition(1, 4);
        list.printNode();
        list.deleteNodeAt(1);
        list.printNode();
        //System.out.println(list.first.data);
    }
    
}
