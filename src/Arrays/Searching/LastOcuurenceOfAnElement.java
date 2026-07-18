package Arrays;

public class LastOcuurenceOfAnElement {
    public static void main(String[] args) {
        int []arr={5,6,5,3,5,4};
        int n=5;
        int index=0;
        for(int i=0;i<arr.length;i++){
            int count=0;
                if(arr[i]==n){
                    count++;
                    index=i;
                }
        }

        System.out.println("The last index "+n+ " is : "+index);

    }
}
