package Stack;

import java.util.Scanner;
import java.util.Stack;

public class min_bracket_to_remove_to_make_balance {
    public static int  isbalanced(String s){
        Stack<Character> st=new Stack<>();
        int n=s.length();
        int open=0;
        int close=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='('){
                st.push(c);
                open++;
            }
            else{
                if(open>0){
                    open--;
                }
                else{
                   close++;
                }
            }
        }
        return open+close;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String  str=sc.nextLine();
        System.out.println(str);
        System.out.println(isbalanced(str));
    }
}

