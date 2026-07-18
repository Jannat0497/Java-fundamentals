package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Deletion_at_pos {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(28);
        st.push(36);
        st.push(44);
        System.out.println(st);
        int pos=sc.nextInt();

        Stack<Integer> rt=new Stack<>();

        while(st.size()>pos){
            rt.push(st.pop());
        }
        st.pop();
        while(!rt.isEmpty()){
            st.push(rt.pop());
        }
        System.out.println(st);

    }
}
