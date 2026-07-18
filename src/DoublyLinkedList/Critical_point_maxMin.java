package DoublyLinkedList;
import java.util.ArrayList;
public class Critical_point_maxMin {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node (int data) {
            this.data = data;
        }
    }

    public static void critical_point(Node head){
            if (head == null || head.next == null || head.next.next == null) {
                System.out.println("Not enough nodes");
                return;
            }

            Node prev = head;
            Node curr = head.next;
            Node next = curr.next;

            int index = 1;
            ArrayList<Integer> cp = new ArrayList<>();

            while (next != null) {
                if ((curr.data > prev.data && curr.data > next.data) ||
                        (curr.data < prev.data && curr.data < next.data)) {
                    cp.add(index);
                }

                prev = curr;
                curr = next;
                next = next.next;
                index++;
            }

            if (cp.size() < 2) {
                System.out.println("Less than two critical points");
                return;
            }

            int min = Integer.MAX_VALUE;
            for (int i = 1; i < cp.size(); i++) {
                min = Math.min(min, cp.get(i) - cp.get(i - 1));
            }

            int max = cp.get(cp.size() - 1) - cp.get(0);

            System.out.println("Max distance: " + max);
            System.out.println("Min distance: " + min);
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
        Node a =new Node(1);
        Node b =new Node(2);
        Node c =new Node(5);
        Node d =new Node(3);
        Node e =new Node(2);
        Node f =new Node(7);
        Node g =new Node(8);
        Node h =new Node(9);
        Node i =new Node(1);
        Node j =new Node(10);
        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=f;
        f.prev=e;
        f.next=g;
        g.prev=f;
        g.next=h;
        h.prev=g;
        h.next=i;
        i.prev=h;
        i.next=j;
        j.prev=i;
        j.next=null;

        System.out.print("original LL is: ");
        displayAll(a);
        critical_point(a);


    }
}
