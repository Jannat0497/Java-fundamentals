package coding_challenge_12Dec;
import java.util.Scanner;
import java.util.Stack;
public class Balance_parenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int open = 0;
        int close = 0;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(ch=='{'){
               open++;
            }
            else if(ch=='}'){
                if (open>0) {
                    open--;
                }
                else{
                    close++;
                }
            }
            else{
                continue;
            }
        }
        if((open+close)%2!=0){System.out.print(-1);}
        else{
            int res=(open/2)+(close/2)+(open%2)*2;
            System.out.println(res);
        }
    }
}
