package coding_challenge_12Dec;
import java.util.Scanner;
public class duplicate_check {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(!Character.isLetterOrDigit(ch)){
                continue;
            }
            else {
                for (int j = i + 1; j < n; j++) {
                    if (ch == str.charAt(j)) {
                        System.out.println("No");
                        return;
                    }
                }
            }
        }
        System.out.println("Yes");

    }
}
