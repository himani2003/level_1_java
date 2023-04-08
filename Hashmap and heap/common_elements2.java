import java.util.HashMap;
import java.util.Scanner;

public class common_elements2 {
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
            int key=arr1[i];
            if(hm.containsKey(key)){
                hm.put(key,hm.get(key)+1);
            }else{
                hm.put(key,1);
            }
        }
        for(int i=0; i<n2;i++){
            int ele=arr2[i];
            if(hm.containsKey(ele)){
                if(hm.get(ele)==0){
                    hm.remove(ele);
                }
                System.out.println(ele);
                hm.put(ele,hm.get(ele)-1);
            }
        }
    }
}
