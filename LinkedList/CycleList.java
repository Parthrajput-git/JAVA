public class CycleList{
    public static class Node{
        int data;
        Node next=null;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;//+1 step Ahead
            fast=fast.next.next;//+2 step Ahead
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void removeCycle(){
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;//+1
            fast=fast.next.next;//+2
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        slow=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=null;
    }
    public static void main(String args[]){
    head=new Node(1);
    //head.next=new Node(2);
    Node temp=new Node(2);
    head.next=temp;
    head.next.next=new Node(3);
    head.next.next.next=temp;
    System.out.println("LinkedList is a Cycle  :"+isCycle());
    removeCycle();
    System.out.println("LinkedList is a Cycle  :"+isCycle());
    }
}