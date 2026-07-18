package coding_challenge_12Dec;

import java.util.*;

public class print_reverse_queue {
    public static void main(String[] main){
        Queue<Integer> q=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            q.add(x);
        }
        Stack<Integer> st=new Stack<>();
        while(!q.isEmpty()){
            st.push(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop ());
        }
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}
