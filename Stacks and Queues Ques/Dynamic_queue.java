import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Dynamic_queue {
    public static class CustomQueue {
        int[] data;
        int front;
        int size;
    
        public CustomQueue(int cap) {
          data = new int[cap];
          front = 0;
          size = 0;
        }
    
        int size() {
          // write ur code here
          return size;
        }
    
        void display() {
          // write ur code here
          if(size==0)return;
          for(int i=0; i<=size; i++){
            System.out.print(data[(front+i)%data.length]+" ");
          }
          System.out.println();
        }
    
        //change this code
        void add(int val) {
          // write ur code here
          if(size==data.length){
            // System.out.println("Queue overflow");
            // return;
            int[] copy=new int[data.length*2];
            for(int i=0; i<data.length; i++){
                copy[i]=data[(i+front)%data.length];
            }
            front=0;
            this.data=copy;
          }
          int idx=(front+size)%data.length;
          data[idx]=val;
          size++;
        }
    
        int remove() {
          // write ur code here
          if(front<0 || front>=data.length){
            System.out.println("Queue underflow");
            return -1;
          }
          int val=data[front];
          front=(front+1)%data.length;
          size--;
          return val;
        }
    
        int peek() {
           // write ur code here
           return data[front];
        }
      }
    
      public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        CustomQueue qu = new CustomQueue(n);
    
        String str = br.readLine();
        while(str.equals("quit") == false){
          if(str.startsWith("add")){
            int val = Integer.parseInt(str.split(" ")[1]);
            qu.add(val);
          } else if(str.startsWith("remove")){
            int val = qu.remove();
            if(val != -1){
              System.out.println(val);
            }
          } else if(str.startsWith("peek")){
            int val = qu.peek();
            if(val != -1){
              System.out.println(val);
            }
          } else if(str.startsWith("size")){
            System.out.println(qu.size());
          } else if(str.startsWith("display")){
            qu.display();
          }
          str = br.readLine();
        }
      }
}
