import java.util.Scanner;
import java.util.HashMap;
public class common_elements1 {
    public static void main(){
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int[] arr1=new int[n1];
        for(int i=0; i<n1; i++){
            arr1[i]=scn.nextInt();
        }
        int n2=scn.nextInt();
        int[] arr2=new int[n2];
        for(int i=0; i<n2; i++){
            arr2[i]=scn.nextInt();
        }
        common(arr1, n1, arr2, n2);
    }
    public static void common(int[] arr1,int n1, int[] arr2, int n2){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0; i<n1; i++){
            if(!hm.containsKey(arr1[i])){
                hm.put(arr1[i],0);
            }
        }
        for(int i=0; i<n2; i++){
            if(hm.containsKey(arr2[i])){
                System.out.println(arr2[i]);
                hm.remove(arr2[i]);
            }
        }
    }
}
