import java.util.Scanner;

public class Quick_sort {
    public static void quickSort(int[] arr, int lo, int hi) {
        //write your code here
        if(hi==lo)return;//single ele is always sorted
        if(lo>hi)return;//invalid range
        //better way as provide good chances
        /*int mid=(hi+lo)/2;
        swap(arr,mid,hi);
        int pivot=arr[hi]; */
        int pivot=arr[hi];
        int pidx=get_pivot_idx(arr, pivot, lo, hi);
        quickSort(arr, lo, pidx-1);
        quickSort(arr, pidx+1, hi);
      }
    
      public static int get_pivot_idx(int[] arr, int pivot, int lo, int hi) {
        System.out.println("pivot -> " + pivot);
        int i = lo, j = lo;
        while (i <= hi) {
          if (arr[i] <= pivot) {
            swap(arr, i, j);
            i++;
            j++;
          } else {
            i++;
          }
        }
        System.out.println("pivot index -> " + (j - 1));
        return (j - 1);
      }
    
      // used for swapping ith and jth elements of array
      public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    
      public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
        }
        System.out.println();
      }
    
      public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
          arr[i] = scn.nextInt();
        }
        quickSort(arr, 0, arr.length - 1);
        print(arr);
      }
}
