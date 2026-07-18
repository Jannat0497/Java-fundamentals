package LinkedList;
public class InsertionAtBeginning {
    public static class Node {
        int data;//value
        Node next;//address of next node

        Node(int data) {
            this.data = data;
        }

    }
    public static class Linkedll {
        Node head;
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
        }
        void insertAtStart(int value) {
            Node newnode = new Node(value);
            newnode.next = head;
            head = newnode;
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

        Linkedll list=new Linkedll();
        list.head=a;
        list.insertAtStart(10);
        list.display();

    }
}
