package Strings;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder str1 = new StringBuilder(str);

        int count = 1;
        for (int i = 0; i <=str1.length(); i++) {
            for (int j = i+1; j <= str1.length(); j++) {
                System.out.println(str1.substring(i, j));
                count++;
            }
        }
        System.out.println(count);
    }

}
