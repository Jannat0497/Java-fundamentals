package Arrays;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int []arr={4,2,3,5,2,1};
        boolean[] visited = new boolean[arr.length];

        for(int i=0;i<arr.length;i++){
            if(visited[i]){
                continue;
            }
            int count=0;
           for(int j=0;j<arr.length;j++){
               if(arr[i]==arr[j]){
                   visited[j]=true;
                   count++;
               }
           }
           System.out.println(arr[i]+ " is occured : "+count+" times");
        }
    }
}
