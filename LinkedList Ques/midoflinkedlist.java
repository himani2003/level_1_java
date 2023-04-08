// You are required to complete the body of mid function. 
// The function should be an iterative function and should return the mid of linked list. 
// Also, make sure to not use size data member directly or indirectly (by calculating size via making a traversal). 
// In linked list of odd size, mid is unambigous. 
// In linked list of even size, consider end of first half as mid.
public class midoflinkedlist {
    public class Node{
        Node next;
        int data;
    }
    public class LinkedList{
        Node head;
        Node tail;
        int size;
        int midwithoutsize(){
            Node slow=this.head;
            Node fast=this.head;
            while(fast.next!=null && fast.next.next!=null){
                fast=fast.next.next;
                slow=slow.next;
            }
            return slow.data;
        }
        int midwithsize(){
            int mid=0;
            if(this.size%2==0){
                mid=this.size/2;
            }
            else{
                mid=(this.size/2)+1;
            }
            Node ptr=this.head;
            while(mid!=1){
                ptr=ptr.next;
                mid--;
            }
            return ptr.data;
        }
    }
}
