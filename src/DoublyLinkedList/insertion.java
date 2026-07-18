package DoublyLinkedList;

public class insertion {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node (int data) {
            this.data = data;
        }
    }

    public static Node insertion_at_head(Node head,int random){
        Node curr=new Node(random);
        curr.next=head;
        head.prev=curr;
        return curr;
    }
    public static Node insertionAtEnd(Node head,int random){
        Node curr=new Node(random);
        //if head is given in parameter
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=curr;
        curr.prev=temp;
        return curr;
    }
    public static Node insert_at_any_pos(Node head,int index,int x){
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        Node t=new Node(x);
        Node r=temp.next;
        temp.next=t;
        t.prev=temp;
        t.next=r;
        r.prev=t;
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

        System.out.print("insertion at head: ");
        Node temp=insertion_at_head(a,25);
        displayAll(temp);

        System.out.print("insertion at tail: ");
        insertionAtEnd(a,38);
        displayAll(a);

        System.out.print("insertion at any pos: ");
        insert_at_any_pos(a,4,45);
        displayAll(a);
    }
}


