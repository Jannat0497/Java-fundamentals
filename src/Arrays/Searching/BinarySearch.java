package Arrays;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("element u want to search : ");
        int target=sc.nextInt();
        int count=0;
        int index=0;
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                index=mid;
                count=1;
                break;
            }
            else if(arr[mid]>target){
               left=mid+1;

            }
            else{
                right=mid-1;
            }
        }
        if(count==0){
            System.out.println("no element in array");
        }
        else {
            System.out.println(index);
        }
    }
}
