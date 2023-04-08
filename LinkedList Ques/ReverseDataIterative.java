// You are required to complete the body of reverseDI function. 
// The function should be an iterative function and should reverse the contents of linked list by changing the "data" property of nodes.
public class ReverseDataIterative {
    public class Node{
        int data;
        Node next;
    }
    public class LinkedList{
        Node head;
        Node tail;
        int size;

        Node getNodeAt(int idx) {
            if (idx >= this.size || idx < 0) {
                System.out.println("Invalid Argument");
                return null;
            }
            if (this.size == 0) {
                System.out.println("List is Empty");
                return null;
            } else {
                Node ptr = this.head;
                while (idx != 0) {
                    ptr = ptr.next;
                    idx--;
                }
                return ptr;
            }
        }

        void ReverseDI(){
            int left=0, right=this.size-1;
            while(left<right){
                Node n1=getNodeAt(left);
                Node n2=getNodeAt(right);
                int temp=n1.data;
                n1.data=n2.data;
                n2.data=temp;
                left++;
                right--;
            }
        }
    }
}
