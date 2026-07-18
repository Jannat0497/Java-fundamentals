package coding_challenge_12Dec;
import java.util.*;
public class sum_of_next_greatest_element {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Stack<Integer> st=new Stack<>();
        int[] res=new int [n];
        res[n-1]=-1;
        st.push(arr[n-1]);
        int sum=0;
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.size()==0){
                res[i]=-1;
            }
            else{
                res[i]=st.peek();
            }
            st.push(arr[i]);
        }
        for(int i=0;i<n;i++){
            sum+=res[i];
        }
        System.out.println(sum);
    }
}
