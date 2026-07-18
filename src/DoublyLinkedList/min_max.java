package DoublyLinkedList;

public class min_max {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node (int data) {
            this.data = data;
        }
    }

    public static void maxMin(Node head){
        if(head==null){
            System.out.println("head is null");
        }
        Node temp=head;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        while(temp!=null){
            if(temp.data<min){
                min=temp.data;
            }
            if(temp.data>max){
                max=temp.data;
            }
            temp=temp.next;
        }
        System.out.println("max is: "+max);
        System.out.println("min is: "+min);
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
        Node b=new Node(32);
        Node c=new Node(98);
        Node d=new Node(45);
        Node e=new Node(23);
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
        maxMin(a);

    }
}
