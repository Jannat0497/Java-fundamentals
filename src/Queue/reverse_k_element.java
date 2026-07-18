package Queue;

import java.util.*;

public class reverse_k_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            q.add(x);
        }

        int k=sc.nextInt();
        Queue<Integer> q1=new LinkedList<>();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<k;i++){
            st.push(q.remove());
        }
        while(!st.isEmpty()){
            q1.add(st.pop());
        }
        while (!q.isEmpty()){
            q1.add(q.remove());
        }
        System.out.println(q1);

    }
}
