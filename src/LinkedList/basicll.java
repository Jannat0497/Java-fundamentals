package LinkedList;

public class basicll {
    public static class Node{
        int data;//value
        Node next;//address of next node
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args){

        Node a=new Node(5);
        System.out.println(a.next);
        Node b=new Node(3);
        Node c=new Node(2);
        Node d=new Node(4);
        a.next=b;//5->3 2 4
                            //studied about addresses nd all
//        System.out.println(a);
//        System.out.println(a.next);//LinkedList.basicll$Node@8efb846
//        System.out.println(b);
//        System.out.println(c);

                            //printing of data nd value of connected node
//        System.out.println(a.data);//5
//        System.out.println(a.next.data);//3
//        System.out.println(b.data);//3

                           // connecting all nodes
        b.next=c;//5->3->2 4
        c.next=d;//5->3->2->4


    }
}
