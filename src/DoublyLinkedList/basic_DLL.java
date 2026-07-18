package DoublyLinkedList;

public class basic_DLL {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node (int data) {
            this.data = data;
        }
    }

    public static void display_from_random(Node random){
        Node temp=random;
        while(temp.prev!=null){
            temp=temp.prev;
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void reverse_Display(Node tail){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
        System.out.println();
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
        Node a=new Node(4);
        Node b=new Node(10);
        Node c=new Node(2);
        Node d=new Node(99);
        Node e=new Node(13);
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
        System.out.print("reverse LL is: ");
        reverse_Display(e);
        System.out.print("display LL when random pos node is given : ");
        display_from_random(c);
    }
}
