package LinkedList;

public class MakingSeparateFunction {
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
    public static class Node {
        int data;//value
        Node next;//address of next node
        Node head;
        Node(int data) {
            this.data = data;
        }

    }

    public static void main(String[] args) {

        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(2);
        Node d = new Node(4);
        a.next = b;//5->3 2 4
        b.next=c;//5->3->2 4
        c.next=d;//5->3->2->4
        display(a);

    }
}
