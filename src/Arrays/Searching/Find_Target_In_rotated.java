package Arrays;

import java.util.Scanner;

public class Find_Target_In_rotated {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int index=-1;
        int start=0,end=n-1;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                index=mid;
                break;
            } else if (arr[mid] < arr[end]) {
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        System.out.println(index);
        }
}
