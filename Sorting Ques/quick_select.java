public class quick_select {
    public static int Quick_select(int[] arr, int lo, int hi, int k){
        if(k-1>=arr.length){
            return -1;
        }
        int pivot=arr[hi];
        int pidx=partition(arr,pivot,lo,hi);
        if(pidx==k-1){
            return arr[pidx];
        }else if(pidx<k-1){
            return Quick_select(arr, pidx+1, hi, k);
        }else{
            return Quick_select(arr, lo, pidx-1, k);
        }
    }

    public static int partition(int[] arr, int pivot, int lo, int hi){
        int i=lo, j=lo;
        while(j<=hi){
            if(arr[j]>pivot){
                j++;
            }
            else{
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
            }
        }
        return (i-1);
    }
}
