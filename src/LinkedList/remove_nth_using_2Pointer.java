package LinkedList;

public class remove_nth_using_2Pointer {
    static Node head;
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node nthFromEnd(Node head,int n){
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=n;i++) {
            fast = fast.next;
            if(fast == null){
                head=head.next;
                return head;
            }

        }
            while(fast.next!=null){
                fast=fast.next;
                slow=slow.next;
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
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        display(a);
        System.out.println();
        a=nthFromEnd(a,2);
        display(a);
    }
}
