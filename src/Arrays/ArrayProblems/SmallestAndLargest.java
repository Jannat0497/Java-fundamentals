package Arrays;

import java.util.*;

public class SmallestAndLargest {
    static void SmallestAndLargest(int [] arr){

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int[] res=new int[2];
        System.out.println("Smallest number in an array is : "+arr[0]);
        System.out.println("Largest number in an array is: "+arr[arr.length-1]);
        res[0]=arr[0];
        res[1]=arr[arr.length-1];
        System.out.println(Arrays.toString(res));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        SmallestAndLargest(arr);
    }
}
