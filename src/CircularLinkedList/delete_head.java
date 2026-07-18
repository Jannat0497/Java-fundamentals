package CircularLinkedList;
public class delete_head {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node (int data) {
            this.data = data;
        }
    }

    public static Node deletion_at_head(Node head){
        head=head.next;
        return head;

    }

    public static void displayAll(Node head){
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] main){
        // 4 10 2 99 13
        Node a= new Node(4);
        Node  b= new Node(10);
        Node  c= new Node(2);
        Node  d= new Node(99);
        Node  e= new Node(13);
        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;
        System.out.print("original LL is: ");
        displayAll(a);

        System.out.print("deletion of head: ");
        Node temp=deletion_at_head(a);
        displayAll(temp);

    }
}
