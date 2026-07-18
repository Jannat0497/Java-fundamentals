package Strings;

import java.util.Scanner;

public class Toggle_Case {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder str1=new StringBuilder(str);
        for(int i=0;i<str1.length();i++){
            int ascii=(int)str1.charAt(i);
            System.out.println(ascii);
            if(ascii>=97){
                ascii=ascii-32;
                char ch=(char)ascii;
                str1.setCharAt(i,ch);
            }
            else if(ascii>=65 && ascii<=90){
                ascii=ascii+32;
                char ch=(char)ascii;
                str1.setCharAt(i,ch);
            }
        }
        System.out.println(str1);



    }
}
