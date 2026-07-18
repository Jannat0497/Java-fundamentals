package LinkedList;

public class Insertion_in_between {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class LinkedLL{
        Node head;
        void insertioAtPosition(int value,int pos){
            Node newnode =new Node(value);
            if(pos==0){
                newnode.next=head;
                head=newnode;
                return;
            }
            Node temp=head;
            for(int i=0;i<pos-1;i++){
                temp=temp.next;
            }
            if(temp==null){
                System.out.println("pos out of range");
            }
            newnode.next=temp.next;
            temp.next=newnode;
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

        LinkedLL list=new LinkedLL();
        list.head=a;
        list.insertioAtPosition(10,4);
        list.display();
    }
}
