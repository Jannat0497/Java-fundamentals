package Arrays;
import java.util.Scanner;
public class CountTheNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the target number is : ");
        int b=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==b){
                count++;
            }
        }
        System.out.println(count);
    }
}
