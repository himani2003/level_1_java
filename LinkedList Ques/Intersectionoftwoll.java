// You are required to complete the body of findIntersection function. 
// The function is passed two linked lists which start separately but merge at a node and become common thereafter. 
// The function is expected to find the point where two linked lists merge. 
// You are not allowed to use arrays to solve the problem.
public class Intersectionoftwoll {
    public class Node{
        Node next;
        int data;
    }
    public class LinkedList{
        int size;
        Node head;
        Node tail;

        public static int Intersection(LinkedList one, LinkedList two){
            int n1=one.size, n2=two.size;
            Node p1=one.head;
            Node p2=two.head;
            if(n1>n2){
                int diff=n1-n2;
                while(diff!=0){
                    p1=p1.next;
                    diff--;
                }
                while(p1.data!=p2.data){
                    p1=p1.next;
                    p2=p2.next;
                }
                return p1.data;
            }
            else{
                int diff=n2-n1;
                while(diff!=0){
                    p2=p2.next;
                    diff--;
                }
                while(p1.data!=p2.data){
                    p1=p1.next;
                    p2=p2.next;
                }
                return p1.data;
            }
        }
    }
}
