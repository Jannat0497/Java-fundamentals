package coding_challenge_17Dec;
import java.util.*;
public class Postfix_using_stack {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s=input.nextLine();
        Stack<Integer> st=new Stack<>();
        int n=s.length();
        int res=0;
        for(char ch:s.toCharArray()){
            if(ch==' '){continue;}
            if(Character.isDigit(ch)) {
                st.push(ch-'0');
            }
            else{
             int b=st.pop();
             int a=st.pop();
                switch(ch){
                    case '+':res=a+b;break;
                    case '-':res=a-b;break;
                    case '*':res=a*b;break;
                    case '/':res=a/b;break;
                    case '^':Math.pow(a,b);break;
                }
                st.push(res);
            }
        }
        System.out.println(st.pop());
    }
}
