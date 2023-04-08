// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are required to calculate the inverse of array a.
import java.util.Scanner;
public class Inverse {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }
        int[] ans=inverse(arr);
        for(int val: ans){
            System.out.println(val);
        }
    }

    public static int[] inverse(int[] arr){
        int[] res=new int[arr.length];
        for(int idx=0; idx<arr.length; idx++){
            int val=arr[idx];
            res[val]=idx;
        }
        return res;
    }
}
