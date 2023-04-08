// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.

// Asssumption - Array is sorted. Array may have duplicate values.
import java.util.Scanner;
public class FirstandLastIndex {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]=scn.nextInt();
        }
        int d=scn.nextInt();
        // Index(arr,d);
        firstindex(arr,d);
        lastindex(arr,d);
    }

    //approach-1
    public static void firstindex(int[] arr, int d){
        int lo=0, hi=arr.length-1, res=-1;
        while(lo<=hi){
            int mid=(hi+lo)/2;
            if(arr[mid]>d){
                hi=mid-1;
            }
            else if(arr[mid]<d){
                lo=mid+1;
            }
            else{
                res=mid;
                hi=mid-1;
            }
        }
        System.out.println(res);
    }

    public static void lastindex(int[] arr, int d){
        int lo=0, hi=arr.length-1, res=-1;
        while(lo<=hi){
            int mid=(hi+lo)/2;
            if(arr[mid]<d){
                lo=mid+1;
            }
            else if(arr[mid]>d){
                hi=mid-1;
            }
            else{
                res=mid;
                lo=mid+1;
            }
        }
        System.out.println(res);
    }

    //approach-2
    // public static void Index(int[] arr, int d){
    //     int lo=0, hi=arr.length-1;
    //     while(lo<=hi){
    //         int mid=(hi+lo)/2;
    //         if(arr[mid]<d){
    //             lo=mid+1;
    //         }
    //         else if(arr[mid]>d){
    //             hi=mid-1;
    //         }
    //         else{
    //             int temp=mid;
    //             while(arr[mid]==d){
    //                 mid++;
    //             }
    //             while(arr[temp]==d){
    //                 temp--;
    //             }
    //             System.out.println(temp+1);
    //             System.out.println(mid-1);
    //             return;
    //         }
    //     }
    // }
}
