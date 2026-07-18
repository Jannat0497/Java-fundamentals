package coding_challenge_17Dec;
import java.util.*;
public class Queue_TicketCounter {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] tickets = new int[n];
            for (int i = 0; i < n; i++) {
                tickets[i] = sc.nextInt();
            }
            int p = sc.nextInt();
            int time = 0;
            int myTickets = tickets[p];
            for (int i = 0; i < n; i++) {
                if (i <= p) {
                    time += Math.min(tickets[i], myTickets);
                } else {
                    time += Math.min(tickets[i], myTickets - 1);
                }
            }
            System.out.println(time);
        }
    }

