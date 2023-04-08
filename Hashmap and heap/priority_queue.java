import java.util.Collections;
import java.util.PriorityQueue;

public class priority_queue {
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq=new PriorityQueue<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int[] ranks={2,7,9,100,50,36};

        for(int val:ranks){
            pq.add(val);
        }

        while(pq.size()>0){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
