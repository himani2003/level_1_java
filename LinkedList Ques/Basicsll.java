
public class Basicsll {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addlast(int val) {
            Node node = new Node();
            node.data = val;
            if (this.size == 0) {
                this.head = node;
                this.tail = node;
            } else {
                this.tail.next = node;
                this.tail = node;
            }
            this.size++;
        }

        void display() {
            Node ptr = this.head;
            while (ptr != null) {
                System.out.println(ptr.data);
                ptr = ptr.next;
            }
        }

        int size() {
            return this.size();
        }

        void removefirst() {
            if (this.size == 0) {
                System.out.println("List is empty");
                return;
            }
            if (this.size == 1) {
                this.head = null;
                this.tail = null;
            } else {
                Node node = this.head;
                this.head = node.next;
                node.next = null;
            }
            this.size--;
        }

        int getFirst() {
            if (this.size == 0) {
                System.out.println("List is Empty");
                return -1;
            }
            return this.head.data;
        }

        int getLast() {
            if (this.size == 0) {
                System.out.println("List is Empty");
                return -1;
            }
            return this.tail.data;
        }

        int getAt(int idx) {
            if (idx >= this.size || idx < 0) {
                System.out.println("Invalid Argument");
                return -1;
            }
            if (this.size == 0) {
                System.out.println("List is Empty");
                return -1;
            } else {
                Node ptr = this.head;
                while (idx != 0) {
                    ptr = ptr.next;
                    idx--;
                }
                return ptr.data;
            }
        }

        void addfirst(int val) {
            Node node = new Node();
            node.data = val;
            if (this.size == 0) {
                this.head = node;
                this.tail = node;
            } else {
                node.next = this.head;
                this.head = node;
            }
            this.size++;
        }

        void addAt(int idx, int val) {
            Node node = new Node();
            node.data = val;
            if (idx >= this.size || idx < 0) {
                System.out.println("Invalid Argument");
                return;
            }
            if (this.size == 0) {
                this.head = this.tail = node;
            } else if (idx == 0) {
                addfirst(val);
            } else if (idx == this.size - 1) {
                addlast(val);
            } else {
                Node ptr = this.head;
                while (idx != 1) {
                    ptr = ptr.next;
                    idx--;
                }
                node.next = ptr.next;
                ptr.next = node;
            }
            this.size++;
        }

        void removeLast(){
            if(this.size==0){
                System.out.println("List is empty");
                return;
            }
            else if(this.size==1){
                this.head=this.tail=null;
            }
            else{
                Node ptr=this.head;
                while(ptr.next!=tail){
                    ptr=ptr.next;
                }
                ptr.next=null;
                this.tail=ptr;
            }
            this.size--;
        }

        void removeAt(int idx){
            if (idx >= this.size || idx < 0) {
                System.out.println("Invalid Argument");
                return;
            }
            if(idx==0){
                removefirst();
            }
            else if(this.size==1){
                this.tail=this.head=null;
            }
            else if(idx==idx-1){
                removeLast();
            }
            else{
                Node prev=null;
                Node curr=this.head;
                while(idx!=0){
                    prev=curr;
                    curr=curr.next;
                    idx--;
                }
                prev.next=curr.next;
                curr.next=null;
            }
            this.size--;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addfirst(10);
        ll.addlast(50);
    }
}
