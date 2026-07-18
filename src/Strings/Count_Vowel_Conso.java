package Strings;

import java.util.Scanner;

public class Count_Vowel_Conso {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int vowel=0;
        int consonant=0;
        str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' '){
                continue;
            }
            else if(ch=='a'||ch=='e'||ch=='i'||ch=='u'||ch=='o'){
                vowel++;
            }
            else {
                consonant++;
            }
        }
        System.out.println(vowel+" "+consonant);
    }
}
