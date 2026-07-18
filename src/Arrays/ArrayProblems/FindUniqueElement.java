package Arrays;

import java.util.*;

public class FindUniqueElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        Arrays.sort(arr);

        for(int i=0;i<n-1;i+=2){
            if(arr[i]!=arr[i+1]){
                count=1;
                System.out.println("Unique Element is : "+ arr[i]);
                break;
            }
        }
        if(count==0){
            System.out.println("Unique Element is : "+ arr[n-1]);
        }
    }
}
