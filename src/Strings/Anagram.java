package Strings;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.nextLine();
        char[] str1 = s.toCharArray();
        char[] str2 = s1.toCharArray();
        if (str1.length != str2.length) {
            System.out.println("not anagram");
        }
        Arrays.sort(str1);
        Arrays.sort(str2);
        if (Arrays.equals(str1, str2)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

