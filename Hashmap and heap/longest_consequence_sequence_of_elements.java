import java.util.Scanner;
import java.util.HashMap;

public class longest_consequence_sequence_of_elements {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }

        HashMap<Integer,Boolean> map=new HashMap<>();
        
        for(int val:arr){
            map.put(val,true);
        }

        for(int val:arr){
            if(map.containsKey(val-1)){
                map.put(val,false);
            }
        }

        int msp=0;
        int ml=0;
        for(int val:arr){
            if(map.get(val)==true){
                int tl=1;
                int tsp=val;

                while(map.containsKey(tsp+tl)){
                    tl++;
                }
                if(tl>ml){
                    ml=tl;
                    msp=tsp;
                }
            }
        }

        for(int ti=0; ti<ml; ti++){
            System.out.println(msp+ti);
        }

    }
}
