package Strings;

import java.util.Scanner;

public class String_Togglre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str=input.nextLine();
        StringBuilder s=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch)){
                s.append(Character.toLowerCase(ch));
            }
            else if(Character.isLowerCase(ch)){
                s.append(Character.toUpperCase(ch));
            }
            else{
                s.append(ch);
            }
        }
        System.out.print(s.toString());
    }
}
