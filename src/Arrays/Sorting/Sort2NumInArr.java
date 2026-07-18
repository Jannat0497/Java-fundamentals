package Arrays;

import java.util.*;

public class Sort2NumInArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int x=-1,y=-1;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                if(x==-1){
                    x=i;
                    y=i+1;

                }
                else{
                    y=i+1;

                }
            }
        }
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
        System.out.print(Arrays.toString(arr));
    }

}
