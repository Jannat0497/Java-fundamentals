package Stack;

import java.util.Stack;

public class Reversed_Stack {
    public static void main(String args[]){
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.print("Intially the original stack is : "+st);
//reverse the stack
        Stack<Integer> copy=new Stack<>();
        while(!st.isEmpty()){
            copy.push(st.pop());
        }
        System.out.println();
        System.out.println("Copied stack is : "+copy);
    }
}
