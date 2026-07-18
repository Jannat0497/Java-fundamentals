package LinkedList;
public class intersection_of_2_ll {
    static Node head;
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node intersection(Node headA, Node headB){
        Node slow=headA;
        Node fast=headB;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return head;
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
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(6);
        Node f=new Node(3);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        Node x=new Node(1);
        Node y=new Node(2);
        Node z=new Node(4);
        x.next=y;
        y.next=z;
        System.out.println();
        Node m =intersection(a,x);
        display(m);
    }
}
