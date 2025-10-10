import java.util.*;
public class AddMid{
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
    public static int size;
    public void addFirst(int data){
     //Step1: Create new Node;
      Node newNode=new Node(data);
      size++;
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
        size++;
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
        size++;
        Node temp=head;
        int i=0;  

        while(i < ind-1){ 
            temp=temp.next;
            i++;
        }
            newNode.next=temp.next;
            temp.next=newNode;
     }
     public static int removeLast(){
         Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
     }
     public int itrSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
     }
     public int helper(Node head,int key){
      if(head==null){
        return -1;
      }
      if(head.data==key){
        return 0;
      }
      int idx=helper(head.next,key);
      if(idx==-1){
        return -1;
      }
      return idx+1;
     }
     public int recSreach(int key){
        return helper(head,key);
     }
     public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
     }
     public void nthNode(int n){
       int sz=0;
       Node temp=head;
       while(temp!=null){
        temp=temp.next;
        sz++;
       }
       if(n==sz){
        head=head.next;
        return;
       }
       int i=0;
       int iToFind=sz-n;
       Node prev=head;
       while(i<iToFind){
        prev=prev.next;
        i++;
       }
        prev.next=prev.next.next;
        return;
     }
     public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;// retrun mid;
     }
     public boolean checkPalindrome(){
        if(head==null && head.next==null){
            return true;
        }
        //step: find mid;
       Node midNode=findMid(head);
        //step:reverse 2nd half
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
         next=curr.next;
         curr.next=prev;
         prev=curr;
         curr=next;
        }
        Node right=prev;
        Node left=head;
       //stepa: ckeck left half & right half
       while(right!=null){
        if(left.data!=right.data){
            return false;
        }
        left=left.next;
        right=right.next;
       }
       return true;
     }
     public static void main(String args[]){
     AddMid ll=new AddMid();
    //  ll.addFirst(2);
    //  ll.addFirst(1);
    //  ll.addLast(3);
    //  ll.addLast(5);
    //  ll.addMid(3,4);
    //  ll.print();
    //  ll.nthNode(3);
    ll.addLast(1);
     ll.addLast(2);
     ll.addLast(2);
     //ll.addLast(1);
     ll.print();
    System.out.println(ll.checkPalindrome());
    // System.out.println(ll.nthNode());
     //ll.removeFirst();
     //removeLast();
     //ll.print();
     //ll.reverse();
     //ll.print();
     //System.out.println(ll.recSreach(4));
     // System.out.println(ll.recSreach(14));
    // System.out.print("Size of LinkedList   :"+ ll.size);
    //System.out.println(ll.itrSearch(3));
    //System.out.println(ll.itrSearch(10));
    }
}