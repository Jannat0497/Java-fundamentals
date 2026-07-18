package coding_challenge_19Dec;
import java.util.Scanner;
public class sum_of_col {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row=input.nextInt();
        int col=input.nextInt();
        int i,j,sum;
        int[][] arr=new int[row][col];
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                arr[i][j]=input.nextInt();
            }
        }

        for(i=0;i<col;i++){
            sum=0;
            for(j=0;j<row;j++){
                sum+=arr[j][i];
            }
            System.out.println("sum of "+(i+1)+"col is= "+sum);
        }
    }
}
