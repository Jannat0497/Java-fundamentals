package Strings;

import java.util.Scanner;

public class reverse_in_place {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] s=str.split(" ");
        String res="";
        for(int i=0;i<s.length;i++){
            StringBuilder s1=new StringBuilder(s[i]);
            s1.reverse();
            if(i<s.length){
                res+=s1;
                res+=" ";
            }
        }
        System.out.print(res);
    }
}
