package Arrays;
import java.util.*;

public class SearchTrainTime {
    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] Book=new int[n];
        for(int i=0;i<n;i++){
            Book[i]=sc.nextInt();
        }

        int k=sc.nextInt();
        int[] ToFind=new int[k];
        for(int i=0;i<k;i++){
            ToFind[i]=sc.nextInt();
        }
        int Total_time=0;
        int index=-1;
        for(int i=0;i<k;i++){
            int target=ToFind[i];
            int left=0;
            int right=n-1;
            while(left<right) {
                int mid=left+(right-left)/2;
                if(Book[i]==target){
                    index=mid;
                    break;
                }

            }
        }
        System.out.println(index);

    }
}
