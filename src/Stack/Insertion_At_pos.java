package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Insertion_At_pos {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(28);
        st.push(36);
        st.push(44);
        System.out.println(st);
        int pos=sc.nextInt();
        int val=sc.nextInt();

        Stack<Integer> rt=new Stack<>();

        while(st.size()>pos){
            rt.push(st.pop());
        }
        st.push(val);
        while(!rt.isEmpty()){
            st.push(rt.pop());
        }
        System.out.println(st);

    }
}
