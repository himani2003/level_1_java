import java.util.PriorityQueue;
import java.util.Scanner;

public class sort_k_sorted_array {
    public static void main(){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }
        int k=scn.nextInt();

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        // for(int val:arr){
        //     if(pq.size()<k+1){
        //         pq.add(val);
        //     }else{
        //         if(pq.peek()<val){
        //             System.out.println(pq.peek());
        //             pq.remove();
        //             pq.add(val);
        //         }
        //     }
        // }

        // while(pq.size()>0){
        //     System.out.println(pq.peek());
        //     pq.remove();
        // }

        for(int i=0; i<=k; i++){
            pq.add(arr[i]);
        }
        for(int i=k+1; i<arr.length; i++){
            System.out.println(pq.peek());
            pq.remove();
            pq.add(arr[i]);
        }
        while(pq.size()>0){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
