package Arrays;

public class MaxElement {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        System.out.println("Max element in an array");
        int max_num=0;
        for(int i=0;i<arr.length;i++){
            max_num=Math.max(max_num,arr[i]);
        }
        System.out.println("Max num in arr is: "+max_num);

        int [][] arr_2D={{1,2,3},{4,5,6}};
        System.out.println("Max element in each row of a 2D array");
        for(int i=0;i<arr_2D.length;i++){
            int max_no=0;
            for(int j=0;j<arr_2D[i].length;j++){
                max_no=Math.max(max_no,arr_2D[i][j]);

            }
            System.out.println("Max num in "+i+" row is : "+ max_no);
        }

        int [][] arr1={{1,2,3},{4,5,6}};
        System.out.println("Max element in each col of a 2D array");
        for(int j=0;j<arr1[0].length;j++){
            int max_number=0;
            for(int i=0;i<arr1.length;i++){
                max_number=Math.max(max_number,arr_2D[i][j]);

            }
            System.out.println("Max num in "+j+" row is : "+ max_number);
        }
    }
}
