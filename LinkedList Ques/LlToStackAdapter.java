// 1. You are required to complete the code of our LLToStackAdapter class. 
// 2. As data members, you've a linkedlist available in the class.
// 3. Here is the list of functions that you are supposed to complete
//     3.1. push -> Should accept new data in LIFO manner
//     3.2. pop -> Should remove and return data in LIFO manner. If not available, print "Stack underflow" and return -1.
//     3.3. top -> Should return data in LIFO manner. If not available, print "Stack underflow" and return -1.
//     3.4. size -> Should return the number of elements available in the stack
import java.util.*;
public class LlToStackAdapter {
    public static class LLToStackAdapter {
        LinkedList<Integer> list;
    
        public LLToStackAdapter() {
          list = new LinkedList<>();
        }
    
    
        int size() {
          return list.size();
        }
    
        void push(int val) {
          list.addFirst(val);
        }
    
        int pop() {
            if(list.size()==0){
                System.out.println("Stack Underflow");
                return -1;
            }
          return list.removeFirst();
        }
    
        int top() {
            if(list.size()==0){
                System.out.println("Stack Underflow");
                return -1;
            }
          return list.getFirst();
        }
      }
}
