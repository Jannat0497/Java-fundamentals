package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        System.out.println("empty queue: "+q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        System.out.println("size of queue is: "+q.size());
        System.out.println("is queue empty: "+q.isEmpty());

        //FIFO -> it will remove 1st element of queue
        q.remove();
        System.out.println(q);

        //an alternate to remove element from starting
        q.poll();
        System.out.println(q);

        //want to print 1st element of the queue
        System.out.println(q.element());
        System.out.println(q.peek());

        //size of queue
        System.out.println("size of queue is: "+q.size());




    }
}
