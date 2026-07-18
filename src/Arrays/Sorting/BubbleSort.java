package Arrays;

import java.util.*;

public class BubbleSort {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] Book=new int[n];
        for(int i=0;i<n;i++){
            Book[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(Book));
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(Book[j]>Book[j+1]){
                    int temp=Book[j];
                    Book[j]=Book[j+1];
                    Book[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted arrays is: ");
        System.out.println(Arrays.toString(Book));

    }
}
