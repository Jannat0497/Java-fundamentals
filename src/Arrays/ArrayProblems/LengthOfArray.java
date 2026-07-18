package Arrays;
import java.util.*;
public class LengthOfArray {
    public static void main(String[] args) {
        int[] ages = new int[10];
        System.out.println(ages.length);
        ages[0]=1;
        ages[1]=2;
        ages[2]=3;
        ages[3]=4;
        System.out.println(ages[2]);
        System.out.println(ages[5]);
        System.out.println(Arrays.toString(ages));
        for(int a:ages){
            System.out.print(a+" ");
        }
    }
}
