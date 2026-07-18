package Arrays;

public class SumOfArray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int sum=0;
        for(int a:arr){
            sum+=a;
        }
        System.out.println(sum);
// sum of each row in a 2D array
        System.out.println("Sum of each row in a 2D array:");
        int [][] arr1={{1,2,3},{4,5,6}};
        for(int i=0;i<arr1.length;i++){
            int sum2=0;
            for(int j=0;j<arr1[i].length;j++){
                sum2+=arr1[i][j];

            }
            System.out.println(sum2);
        }
//sum of each col in 2d array
        System.out.println("Sum of each col in a 2D array:");
        int [][] arr2={{1,2,3},{4,5,6}};
        for(int j=0;j<arr2[0].length;j++){
            int sum2=0;
            for(int i=0;i<arr2.length;i++){
                sum2+=arr2[i][j];

            }
            System.out.println(sum2);
        }
    }
}
