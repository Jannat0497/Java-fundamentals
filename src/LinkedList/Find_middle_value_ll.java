package LinkedList;
public class Find_middle_value_ll {
    static Node head;
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node FindMid(Node head, int n){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void display(Node head){
        Node temp1=head;
        while(temp1!=null){
            System.out.print(temp1.data+" ");
            temp1=temp1.next;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        display(a);
        System.out.println();
        Node m =FindMid(a,6);
        System.out.print(m.data);
    }
}
