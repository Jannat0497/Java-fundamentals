package CircularLinkedList;

public class display_single_circular {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node (int data) {
            this.data = data;
        }
    }

    public static void displayAll(Node head){
        System.out.print(head.data+" ");
        Node temp=head.next;
        while(temp!=head) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] main){
        // 4 10 2 99 13
        Node a= new Node(4);
        Node b= new Node(10);
        Node c= new Node(2);
        Node d= new Node(99);
        Node e= new Node(13);
        a.prev=e;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=a;
        System.out.print("original LL is: ");
        displayAll(a);

    }
}
