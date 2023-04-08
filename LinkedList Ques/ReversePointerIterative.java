// You are required to complete the body of reversePI function. 
// The function should be an iterative function and should reverse the contents of linked list by changing the "next" property of nodes.
public class ReversePointerIterative {
    public class Node{
        int data;
        Node next;
    }
    public class LinkedList{
        Node head;
        Node tail;
        int size;

        void reversePI(){
            Node curr=this.head;
            Node prev=null;
            while(curr!=null){
                Node nbr=curr.next;
                curr.next=prev;
                prev=curr;
                curr=nbr;
            }
            this.tail=this.head;
            this.head=prev;
        }
    }
}
