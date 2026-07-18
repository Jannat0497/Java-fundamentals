package coding_challenge_17Dec;
import java.util.Scanner;
public class count_points {
    public static void main(String[] main){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int points=0;
        if(n==0){
            System.out.println("1");
        }
        if(n>0 &&n<=9){
            if(n==1 || n==2|| n==3 ||n==5 || n==7){
                System.out.println("0");
            }
            else if(n==8){
                System.out.println("2");
            }
            else {
                System.out.println("1");
            }
        }
        while(n>0){
            int rem=n%10;
            if(rem==1 || rem==2 || rem==3 || rem==5 || rem==7){
                points+=0;
            }
            else if(rem==8){
                points+=2;
            }
            else {
                points+=1;
            }
            n=n/10;
        }
        System.out.println("Total points: "+points);
    }
}
