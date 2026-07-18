package LinkedList;
public class DisplayLL {
    public static class Node {
        int data;//value
        Node next;//address of next node

        Node(int data) {
            this.data = data;
        }

    }
    public static void main(String[] args) {
        Node a = new Node(5);
        System.out.println(a.next);
        Node b = new Node(3);
        Node c = new Node(2);
        Node d = new Node(4);
        a.next = b;//5->3 2 4
        b.next = c;//5->3->2 4
        c.next = d;//5->3->2->4
        Node temp=a;//5
        Node temp2=a;
            //Through for loop
        System.out.print("using for loop: ");
        for(int i=0;i<4;i++){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
          //Through while loop
        System.out.print("using while loop: ");
        while(temp2!=null){
            System.out.print(temp2.data+" ");
            temp2=temp2.next;
        }

    }
}
