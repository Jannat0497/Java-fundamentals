package coding_challenge_17Dec;
import java.util.Scanner;
public class Separate_EvenOdd_count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        int even=0;
        int odd=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even digits: "+even);
        System.out.println("Odd digits: "+odd);
    }
}
