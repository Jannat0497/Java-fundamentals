package LinkedList;

public class InsertionAtEnd {
    static Node head;
    public static class Node{
        int data;
        Node next;
        Node (int data){
            this.data=data;
        }
    }


    public static void atStart(int value){
        Node curr=new Node(value);
        curr.next=head;
        head=curr;

    }
    public static void atEnd(int value){
        Node curr=new Node(value);
        Node temp=head;
        if(head == null){       // list empty
            head = temp;
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=curr;

    }
    public static void display(){
            Node temp1=head;
            while(temp1!=null){
                System.out.print(temp1.data+" ");
                temp1=temp1.next;
            }
    }

    public static void main(String[] args){
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(2);
        Node d = new Node(4);
        head=a;
        a.next = b;//5->3 2 4
        b.next=c;//5->3->2 4
        c.next=d;//5->3->2->4
        System.out.println("adding element at end");
        atEnd(1);
        display();

        System.out.println("adding element at start");
        atStart(6);
        display();
    }
}
