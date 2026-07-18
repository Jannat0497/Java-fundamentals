package DoublyLinkedList;

public class palindrom {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node (int data) {
            this.data = data;
        }
    }

    public static boolean palindrom(Node head){
        Node h=head;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node t=temp;
        while(h!=t){
            if(h.data!= t.data){return false;}
            h=h.next;
            t=t.prev;
        }
        return true;
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
        Node b= new Node(10);
        Node c= new Node(2);
        Node d= new Node(10);
        Node e= new Node(4);
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
        boolean temp=palindrom(a);
        if(temp==true){
            System.out.println("palindrom");
        }
        else{
            System.out.println("not palindrom");
        }
    }
}
