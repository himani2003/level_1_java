// You are required to complete the body of kthFromLast function. 
// The function should be an iterative function and should return the kth node from end of linked list. 
// Also, make sure to not use size data member directly or indirectly (by calculating size via making a traversal). 
// k is a 0-based index. Assume that valid values of k will be passed.
public class kthnodefromend {
    public class Node{
        Node next;
        int data;
    }
    public class LinkedList{
        int size;
        Node head;
        Node tail;
        int kthfromendwithoutsize(int k){
            Node slow=this.head;
            Node fast=this.head;
            while(k!=1){
                fast=fast.next;
                k--;
            }
            while(fast.next!=null){
                slow=slow.next;
                fast=fast.next;
            }
            return slow.data;
        }
        int kthfromendwithsize(int k){
            int idx=this.size-k+1;
            Node ptr=this.head;
            while(idx!=1){
                ptr=ptr.next;
                idx--;
            }
            return ptr.data;
        }
    }
}
