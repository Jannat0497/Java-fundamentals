package coding_challenge_17Dec;
import java.util.*;
public class reverse_the_oddPos_Queue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Queue<Integer> q= new LinkedList<>();
        Queue<Integer> even = new LinkedList<>();
        Stack<Integer> odd = new Stack<>();
        for(int i=0;i<n;i++){
            int x=input.nextInt();
            q.add(x);
        }
        for(int i=0;i<n;i++){
            if(i%2==0){
                even.add(q.remove());
            }
            else{
                odd.push(q.remove());
            }
        }
        for(int i=0;i<n;i++){
            if(i%2==0){
                q.add(even.remove());
            }
            else{
                q.add(odd.pop());
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(q.remove()+" ");
        }
    }
}
