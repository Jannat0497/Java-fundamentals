package Arrays;

import java.util.Scanner;

// que:Find the index of min element in an array using binary search bcz of time complexity
//     3 4 5 1 2
// output should be is: min:3
public class SearchInRotatedArray {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int left=0;
        int right=n-1;
        int ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]>arr[n-1]){
                left=mid+1;
            }
            else {
                ans = mid;
                right = mid - 1;
            }
        }
        System.out.println("min elemnt from an array lies at index: "+ans);
    }
}
