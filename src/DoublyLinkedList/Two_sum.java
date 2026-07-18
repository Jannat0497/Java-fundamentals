package DoublyLinkedList;

public class Two_sum {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node (int data) {
            this.data = data;
        }
    }

    public static void twoSum(Node head,int target){
        Node h=head;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node t=temp;
        Node left=h;
        Node right=t;
        int found=0;
         temp=head;
        while(left.data<right.data){
            if(left.data+right.data==target){
                System.out.println(left.data+" "+right.data);
                found=1;
                break;
            }
            if(left.data+right.data>target){
                right=right.prev;
            }
            if(left.data+right.data<target){
                left=left.next;
            }
        }
        if(found==0){
            System.out.println("no data");
        }

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
        Node a=new Node(3);
        Node b=new Node(5);
        Node c=new Node(7);
        Node d=new Node(9);
        Node e=new Node(11);
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
        int target=16;
        System.out.print("original LL is: ");
        displayAll(a);

        System.out.print("target found at: ");
        twoSum(a,target);

    }
}
