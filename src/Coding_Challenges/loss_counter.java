package coding_challenge_17Dec;
import java.util.Scanner;
public class loss_counter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                count++;
            }
        }
        System.out.print("Total loss is: "+ count);
    }
}
