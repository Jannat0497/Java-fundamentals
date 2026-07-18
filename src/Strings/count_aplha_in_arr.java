package Strings;

import java.util.Scanner;
public class count_aplha_in_arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=1;
        StringBuilder s=new StringBuilder();
        for(int i=1;i<=str.length();i++){
            if(i<str.length() && str.charAt(i)==str.charAt(i-1)){
                count++;
            }
            else{
                s.append(str.charAt(i-1));
                s.append(count);
                count=1;
            }
        }
        System.out.print(s);

    }
}
