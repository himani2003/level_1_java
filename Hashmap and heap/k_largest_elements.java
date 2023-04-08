import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class k_largest_elements {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }
        int k=scn.nextInt();
        //print in decreasing order
        // PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        // for(int val:arr){
        //     pq.add(val);
        // }
        // while(k>0){
        //     System.out.println(pq.peek());
        //     pq.remove();
        //     k--;
        // }
        //print in increasing order
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int val:arr){
            if(k!=0){
                pq.add(val);
                k--;
            }else{
                if(val>pq.peek()){
                    pq.remove();
                    pq.add(val);
                }
            }
        }
        while(pq.size()>0){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
