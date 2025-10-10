import java.util.*;
public class CreateList{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
     //Step1: Create new Node;
      Node newNode=new Node(data);
      if(head==null){
        head=tail=newNode;
        return;
      }
     //Step2: newNode=head;
     newNode.next=head;
     //Step3: head=newNode;
     head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
         tail.next=newNode;
        tail=newNode;
    }   
    public void print(){
        if(head==null){
            System.out.println("List is empty  :");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public int removeFirst(){
        int val=head.data;
        head=head.next;
        return val;
    }
    public void addMid(int ind,int data){
        if(ind==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;  

        while(i < ind-1){ 
            temp=temp.next;
            i++;
        }
            newNode.next=temp.next;
            temp.next=newNode;
     }
     public static void main(String args[]){
     CreateList ll=new CreateList();
     ll.addFirst(2);
     ll.addFirst(1);
     ll.addLast(3);
     ll.addLast(4);
     ll.addMid(2,9);
     //ll.removeFirst();
     ll.print();
    }
}