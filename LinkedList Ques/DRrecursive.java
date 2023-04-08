//Display reverse recursive 
//Reverse LL pointer recursive
public class DRrecursive {
    public class Node {
        int data;
        Node next;
    }

    public class LinkedList {
        Node head;
        Node tail;
        int size;

        private void displayReverseHelper(Node node) {
            if (node == null) {
                return;
            }
            displayReverseHelper(node.next);
            System.out.println(node.data);
        }

        public void displayReverse() {
            displayReverseHelper(head);
            System.out.println();
        }

        private void reversePRHelper(Node node) {
            // write your code here
            if(node==null || node==tail){
                return;
            }
            reversePRHelper(node.next);
            node.next.next=node;
        }

        public void reversePR() {
            // write your code here
            reversePRHelper(head);
            this.head.next=null;
            Node temp=this.head;
            this.head=this.tail;
            this.tail=temp;
        }
    }
}
