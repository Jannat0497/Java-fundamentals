package LinkedList;

public class LengthOfLL {
    public static class Node{
        int data;
        Node next;
        Node (int data){
            this.data=data;
        }
    }
    public static class linkedll{
        Node head;
        void length_nodes(Node head){
            int count=0;
            Node temp=head;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            System.out.print(count);
        }
        void display(){
            Node temp1=head;
            while(temp1!=null){
                System.out.print(temp1.data+" ");
                temp1=temp1.next;
            }
        }
    }
    public static void main(String[] args){
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(2);
        Node d = new Node(4);
        a.next = b;//5->3 2 4
        b.next=c;//5->3->2 4
        c.next=d;//5->3->2->4

        linkedll list=new linkedll();
        list.length_nodes(a);
        list.display();
    }
}
