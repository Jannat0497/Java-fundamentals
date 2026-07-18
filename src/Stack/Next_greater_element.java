package Stack;

import java.util.Stack;
public class Next_greater_element {

    public static void main(String[] args) {
        int [] arr={1,2,2,3,10,10,10,10,4,4,4,5,5,7,7,2};
        int []res=new  int[arr.length];
        int n=arr.length;
        for(int i=0;i<n;i++){
            res[i]=-1;
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[i]){
                    res[i]=arr[j];
                    break;
                }
            }
        }
        for(int j=0;j<n;j++){
            System.out.print(res[j]+" ");
        }
    }

}
