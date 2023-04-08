// 1. You are required to complete the code of our LLToQueueAdapter class. 
// 2. As data members, you've a linkedlist available in the class.
// 3. Here is the list of functions that you are supposed to complete
//      3.1. add -> Should accept new data in FIFO manner
//      3.2. remove -> Should remove and return data in FIFO manner. If not available, print "Queue underflow" and return -1.
//      3.3. peek -> Should return data in FIFO manner. If not available, print "Queue underflow" and return -1.
//      3.4. size -> Should return the number of elements available in the queue
import java.util.*;
public class LlToQueueAdapter {
    public static class LLToQueueAdapter {
        LinkedList<Integer> list;
    
        public LLToQueueAdapter() {
          list = new LinkedList<>();
        }
    
        int size() {
          return list.size();
        }
    
        void add(int val) {
          list.addLast(val);
        }
    
        int remove() {
            if(list.size()==0){
                System.out.println("Queue underflow");
                return -1;
            }
          return list.removeFirst();
        }
    
        int peek() {
            if(list.size()==0){
                System.out.println("Queue underflow");
                return -1;
            }
          return list.getFirst();
        }
      }
}
