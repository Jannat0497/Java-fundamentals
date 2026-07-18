package Stack;

import java.util.Stack;

public class infix_to_postfix {

    static int precedence(char ch) {
        if(ch=='^') return 3;
        if(ch=='*' || ch=='/' || ch=='%') return 2;
        if(ch=='+' || ch=='-') return 1;
        return -1;
    }

    static String infixToPostfix(String exp) {
        Stack <Character> st = new Stack<>();
        String result="";
        for(int i=0; i<exp.length();i++){
            char ch = exp.charAt(i);
            if(ch == ' ' ) continue;
            if(Character.isLetterOrDigit(ch)){
                result+=ch;
            }
            else if(ch == '('){
                st.push(ch);
            }
            else if(ch==')'){
                while(!st.isEmpty()&& st.peek()!='('){
                    result+=st.pop();
                }
                st.pop();
            }
            else{
                while (!st.isEmpty() && precedence(st.peek()) >= precedence(ch)){
                    result+=st.pop();
                }
                st.push(ch);
            }
        }
        while (!st.isEmpty()){
            result+=st.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        String infix = "2+5*(4+5)";
        System.out.println(infixToPostfix(infix));
    }
}