package coding_challenge_17Dec;
import java.util.Scanner;
public class Split_circular_list {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        // Print circular list
        static void printList(Node head) {
            Node temp = head;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
            System.out.println();
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of nodes: ");
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Invalid input");
                return;
            }

            System.out.print("Enter elements: ");
            int data = sc.nextInt();
            Node head = new Node(data);
            Node tail = head;

            for (int i = 1; i < n; i++) {
                data = sc.nextInt();
                Node newNode = new Node(data);
                tail.next = newNode;
                tail = newNode;
                tail.next = head;


            }
        }
}

