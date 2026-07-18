package Strings;

import java.util.Scanner;

public class reverse_String {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder str=new StringBuilder(s);
        str.reverse();
        System.out.println(str.toString());
    }
}
