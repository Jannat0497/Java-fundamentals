package coding_challenge_17Dec;
import java.util.*;
public class Alternate_k_reverse {
        public static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
            static Node reverseAlternateK(Node head, int k) {
                if (head == null || k <= 1) {
                    return null;
                }
                Node curr = head;
                Node prev = null;
                int count = 0;
                while (curr != null && count < k) {
                    Node next = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = next;
                    count++;
                }
                head.next = curr;
                count = 0;
                while (curr != null && count < k - 1) {
                    curr = curr.next;
                    count++;
                }
                if (curr != null) {
                    curr.next = reverseAlternateK(curr.next, k);
                }
                return prev;
            }

            // Print linked list
            static void printList(Node head) {
                while (head != null) {
                    System.out.print(head.data + " ");
                    head = head.next;
                }
            }

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter number of nodes: ");
                int n = sc.nextInt();
                if (n == 0) {
                    System.out.println("Empty list");
                    return;
                }
                System.out.print("Enter elements: ");
                Node head = new Node(sc.nextInt());
                Node tail = head;

                // Input remaining nodes
                for (int i = 1; i < n; i++) {
                    tail.next = new Node(sc.nextInt());
                    tail = tail.next;
                }

                System.out.print("Enter k: ");
                int k = sc.nextInt();

                // Reverse alternate k nodes
                head = reverseAlternateK(head, k);

                // Output
                System.out.println("Result:");
                printList(head);
            }
        }


