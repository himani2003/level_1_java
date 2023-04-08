// You are required to print the values told by the money exchange to the foreigner.

// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of the array a.
// 3. You are given another number d.
// 4. You are required to find the ceil and floor of d in array a.

import java.util.Scanner;

public class Beconomy {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]=scn.nextInt();
        }
        int d=scn.nextInt();
        brokeneconomy(arr, d);
    }

    public static void brokeneconomy(int[] arr, int d){
        int lo=0, hi=arr.length-1;
        while(lo<=hi){
            int mid=(hi+lo)/2;
            if(arr[mid]>d){
                hi=mid-1;
            }
            else if(arr[mid]<d){
                lo=mid+1;
            }
            else{
                System.out.println(arr[mid]);
                return;
            }
        }
        System.out.println(arr[lo]);
        System.out.println(arr[hi]);
    }
}
