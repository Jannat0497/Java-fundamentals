package Arrays;
import java.util.*;

public class TargetSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the target number is : ");
        int b=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==b){
                    sum++;
                }
            }
        }
        System.out.println(sum);



    }

}
