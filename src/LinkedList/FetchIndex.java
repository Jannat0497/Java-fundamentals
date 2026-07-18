package LinkedList;
public class FetchIndex {
    static Node head;
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static int getAt(int ind){
        Node temp=head;
        for(int i=0;i<ind;i++){
            if(temp==null){
                System.out.print("out of range");
                return -1;
            }
            temp=temp.next;

        }
        if(temp==null){
            System.out.print("out of range");
            return -1;
        }
        return temp.data;
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
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        head=a;
        a.next = b;//5->3 2 4
        b.next=c;//5->3->2 4
        c.next=d;//5->3->2->4
        System.out.println(getAt(1));
        display();
    }
}
