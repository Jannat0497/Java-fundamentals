package coding_challenge_19Dec;

import java.util.Scanner;

public class trim_count_length {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] st= str.trim().split("\\s+");
        System.out.println(st.length);
    }
}
