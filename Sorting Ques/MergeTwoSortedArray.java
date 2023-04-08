import java.util.Scanner;

public class MergeTwoSortedArray {
    public static int[] mergeTwoSortedArrays(int[] a, int[] b) {
        int n = a.length, m = b.length;
        int[] ans = new int[n + m];
        int p1 = 0, p2 = 0;
        for (int idx = 0; idx < ans.length; idx++) {
            int v1 = (p1 < n) ? a[p1] : Integer.MAX_VALUE;
            int v2 = p2 < m ? b[p2] : Integer.MAX_VALUE;
            // ans[idx]=Math.min(v1,v2);
            // if(ans[idx]==a[p1])p1++;
            // else if(ans[idx]==b[p2])p2++;
            if (v1 < v2) {
                ans[idx] = v1;
                p1++;
            } else {
                ans[idx] = v2;
                p2++;
            }
        }

        return ans;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scn.nextInt();
        }
        int[] mergedArray = mergeTwoSortedArrays(a, b);
        print(mergedArray);
    }
}
