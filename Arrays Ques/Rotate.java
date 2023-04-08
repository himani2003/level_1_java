// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are given a number k.
// 4. Rotate the array a, k times to the right (for positive values of k), and to the left for negative values of k.
import java.util.Scanner;
public class Rotate {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }
        int k=scn.nextInt();
        rotate(arr,k);
        for(int val: arr){
            System.out.println(val);
        }
    }

    public static void rotate(int[] arr, int k){
        if(k<0){
            k=k+arr.length;
        }
        k=k%arr.length;
        swap(arr,0, arr.length-1-k);
        swap(arr, arr.length-k, arr.length-1);
        swap(arr, 0, arr.length-1);
    }

    public static void swap(int[] arr, int sidx, int lidx){
        int lo=sidx, hi=lidx;
        while(lo<=hi){
            int temp=arr[lo];
            arr[lo]=arr[hi];
            arr[hi]=temp;
            lo++;
            hi--;
        }
    }
}
