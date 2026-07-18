package coding_challenge_12Dec;
import java.util.Scanner;
public class String_Palindrom {
    public static void main(String[] main){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);
        if(str.equals(sb.toString())){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
