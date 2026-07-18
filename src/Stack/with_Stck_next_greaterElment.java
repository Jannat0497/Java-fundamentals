package Stack;

import java.util.Stack;

public class with_Stck_next_greaterElment {
    public static void nextGreatest(int[] arr){
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int[] res=new int[st.size()];
        res[n-1]=-1;
        st.push(arr[n-1]);
        for(int j=n-2;j>=0;j--){
            while(st.size()>0 && st.peek()<arr[j]){
                st.pop();
            }
            if(st.size()==0){
                res[j]=-1;
            }
            else{
                res[j]=st.peek();
            }
            st.push(arr[j]);
        }
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }

    }
    public static void main(String[] args) {
        int [] arr={1,2,2,3,10,10,10,10,4,4,4,5,5,7,7,2};
        nextGreatest(arr);

    }
}
