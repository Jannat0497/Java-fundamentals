package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Balanced_bracket {
    public static boolean isbalanced(String s){
        Stack<Character> st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='('){
                st.push(c);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                if(st.peek()=='('){
                    st.pop();
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String  str=sc.nextLine();
        System.out.println(str);
        System.out.println(isbalanced(str));
    }
}
