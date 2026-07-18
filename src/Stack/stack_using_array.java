package Stack;
import java.util.*;
public class stack_using_array
{
    int[] arr=new int[6];
    int top=-1;
    public void push(int x)
    {
        if(top==arr.length)
        {
            System.out.print("Stack is full");
            return;
        }

        else
        {
            arr[++top]=x;
        }
    }

    public int pop()
    {
        if(top==-1)
        {
            System.out.print("Stack is empty");
            return -1;
        }

        int val=arr[top];
        top--;
        return val;
    }

    public int peek()
    {
        if(top==-1)
        {
            System.out.print("Stack is empty");
            return -1;
        }

        return arr[top];
    }

    public void display()
    {
        for(int i=0;i<=top;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        stack_using_array m=new stack_using_array();
        m.push(1);
        m.push(2);
        m.push(3);
        m.push(4);
        System.out.println(m.pop());
        m.display();


    }
}