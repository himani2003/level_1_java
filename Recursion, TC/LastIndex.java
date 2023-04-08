import java.util.Scanner;

// 4. You are required to find the last index at which x occurs in array a.
// 5. If x exists in array, print the last index where it is found otherwise print -1.
public class LastIndex {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]=scn.nextInt();
        }
        int x=scn.nextInt();
        int ans=lastIndex(arr, n-1, x);
        System.out.println(ans);
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx==-1){
            return -1;
        }
        if(arr[idx]==x){
            return idx;
        }
        else{
            return lastIndex(arr, idx-1, x);
        }
    }
}
