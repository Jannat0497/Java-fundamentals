package Stack;

import java.util.Scanner;
import java.util.Stack;


public class recursively_reverse {
    public static void reverse_display(Stack<Integer> st){
        if(st.isEmpty()){return;}
        int x=st.pop();
        System.out.print(x+" ");
        reverse_display(st);
        st.push(x);
    }

    public static void main(String[] args){
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(28);
        st.push(36);
        st.push(44);
        System.out.println(st);
        reverse_display(st);

    }
}
