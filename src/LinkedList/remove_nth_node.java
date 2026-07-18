package LinkedList;

public class remove_nth_node {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node removeNthFromEnd(Node head,int n){
        int size=0;
        Node temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        temp=head;
        int m=size-n;
        for(int i=0;i<m;i++){
            temp=temp.next;
        }
        return temp;
    }
    public static void main(String[] args){
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(7);
        Node f=new Node(9);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        Node temp=removeNthFromEnd(a,2);
        System.out.println(temp.data);

    }
}
