import java.util.Scanner;

public class BasicArray {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]=scn.nextInt();
        }
        // displayArr(arr, n-1);
        // displayArr(arr, 0);
        // reversedisplay(arr,n-1);
        // reversedisplay(arr, 0);
        int ans=maxOfArray(arr, 0);
        System.out.println(ans);
    }
    //approach - 1
    // public static void displayArr(int[] arr, int idx){
    //     if(idx==-1){
    //         return;
    //     }
    //     displayArr(arr, idx-1);
    //     System.out.println(arr[idx]);
    // }
    //approach - 2
    // public static void displayArr(int[] arr, int idx){
    //     if(idx==arr.length){
    //         return;
    //     }
    //     System.out.println(arr[idx]);
    //     displayArr(arr, idx+1);
    // }
    //reverse display of array
    //approach - 1
    // public static void reversedisplay(int[] arr, int idx){
    //     if(idx==-1){
    //         return;
    //     }
    //     System.out.println(arr[idx]);
    //     reversedisplay(arr, idx-1);
    // }
    //approach - 2
    // public static void reversedisplay(int[] arr, int idx){
    //     if(idx==arr.length){
    //         return;
    //     }
    //     reversedisplay(arr, idx+1);
    //     System.out.println(arr[idx]);
    // }
    //max of an array
    public static int maxOfArray(int[] arr, int idx){
        if(idx==arr.length){
            return Integer.MIN_VALUE;
        }
        int res=maxOfArray(arr, idx+1);
        if(res>arr[idx]){
            return res;
        }
        else{
            return arr[idx];
        }
    }
}
