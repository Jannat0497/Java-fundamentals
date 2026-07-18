package Stack;

import java.util.Stack;

public class Copy_Stack {
    public static void main(String [] args){
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Original stack is : "+st);
        Stack<Integer>rt=new Stack<>();
        while(!st.isEmpty()){
            rt.push(st.pop());
        }
        Stack<Integer> copy=new Stack<>();
        while(!rt.isEmpty()){
            copy.push(rt.pop());
        }
        System.out.println("copied of original stack is: "+copy);
    }
}
