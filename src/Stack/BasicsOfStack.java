package Stack;

import java.util.Stack;

public class BasicsOfStack {
    public static void main(String[] args){
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(28);
        st.push(36);
        st.push(44);
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println("size is: "+st.size());


    }
}
