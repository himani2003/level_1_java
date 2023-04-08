// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are required to reverse the contents of array a.

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }
        reverse(arr);
        for(int val: arr){
            System.out.println(val);
        }
    }

    public static void reverse(int[] arr){
        //approach -1
        for(int i=0; i<arr.length/2; i++){
            int j=arr.length-i-1;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        // approach-2
        int low=0, high=arr.length-1;
        while(low<=high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
}
