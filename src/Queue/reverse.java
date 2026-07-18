package Queue;
import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println("the original queue is: "+q);
        Stack<Integer> st=new Stack<>();
        while(q.size()>0){
            st.push(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        System.out.println("the reversed queue is: "+q);
    }

}
