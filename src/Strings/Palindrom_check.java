package Strings;
import java.util.Scanner;
public class Palindrom_check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder s=new StringBuilder(str);
        s.reverse();
        if(str.equals(s.toString())){
            System.out.println("YES");
        }
        else{
            System.out.println("No");
        }

        System.out.print(s);
    }
}
