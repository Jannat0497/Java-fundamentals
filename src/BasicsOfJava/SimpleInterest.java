package BasicsOfJava;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double principle=sc.nextDouble();
        double rate=sc.nextDouble();
        int time=sc.nextInt();
        double si=(principle*rate*time)/100;
        System.out.print(si);

    }
}
