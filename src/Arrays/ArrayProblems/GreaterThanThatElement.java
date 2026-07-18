package Arrays;

import java.util.Scanner;

public class GreaterThanThatElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("number count above u want: " );
        int b=sc.nextInt();

        System.out.print("The elements are: " );
        int count=0;
        for(int i=0;i<n;i++) {
            if (arr[i] > b) {
                System.out.print(arr[i] + " ");
                count++;
            }
        }

        System.out.println();
        System.out.println("there are "+ count+" elements in the array above "+b );

    }
}
