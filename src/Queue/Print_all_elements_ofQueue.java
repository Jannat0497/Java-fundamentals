package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Print_all_elements_ofQueue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        Queue<Integer> q1=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        //rear<--5 4 3 2 1-->front
        System.out.println("size of queue: "+q.size());
        System.out.println(q);
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ")  ;
            q1.add(q.remove());
        }
        while(!q1.isEmpty()){
             q.add(q1.poll());
        }
    }
}
