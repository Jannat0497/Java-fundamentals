package Arrays;
import java.util.*;
public class SortedOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int []arr2=Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        boolean b=true;
        if(Arrays.equals(arr,arr2)){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not Sorted");
        }


    }
}
