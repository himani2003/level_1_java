// You are given a n*m matrix where n are the number of rows and m are the number of columns. You are also given n*m numbers representing the elements of the matrix.
// You will be given a ring number 's' representing the ring of the matrix. For details, refer to image.
// You will be given a number 'r' representing number of rotations in an anti-clockwise manner of the specified ring.
// You are required to rotate the 's'th ring by 'r' rotations and display the rotated matrix.

import java.util.ArrayList;
import java.util.Scanner;

public class RingRotate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int nr = scn.nextInt();
        int nc = scn.nextInt();
        int[][] mat = new int[nr][nc];
        for (int row = 0; row < nr; row++) {
            for (int col = 0; col < nc; col++) {
                mat[row][col] = scn.nextInt();
            }
        }
        int s = scn.nextInt();
        int r = scn.nextInt();

        ringrotate(mat, s, r);
        display(mat);
    }

    public static int[] fill1d(int[][] mat, int s) {
        int nr = mat.length, nc = mat[0].length;
        int cmin = s - 1, cmax = nc - s, rmin = s - 1, rmax = nr - s;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int r = rmin; r <= rmax; r++) {
            list.add(mat[r][cmin]);
        }
        for (int c = cmin + 1; c <= cmax; c++) {
            list.add(mat[rmax][c]);
        }
        for (int r = rmax - 1; r >= rmin; r--) {
            list.add(mat[r][cmax]);
        }
        for (int c = cmax - 1; c >= cmin + 1; c--) {
            list.add(mat[rmin][c]);
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    public static void swap(int[] a, int low, int high) {
        while (low <= high) {
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;
            low++;
            high--;
        }
    }

    public static void rotate(int[] a, int k) {
        k = k % a.length;
        if (k < 0) {
            k = k + a.length;
        }
        swap(a, 0, a.length - 1 - k);
        swap(a, a.length - k, a.length - 1);
        swap(a, 0, a.length - 1);
    }

    public static void fill2D(int[][] mat, int s, int[] arr) {
        int nr = mat.length, nc = mat[0].length;
        int rmin = s - 1, rmax = nr - s, cmin = s - 1, cmax = nc - s;
        int idx = 0;
        for (int r = rmin; r <= rmax; r++) {
            mat[r][cmin] = arr[idx];
            idx++;
        }
        for (int c = cmin + 1; c <= cmax; c++) {
            mat[rmax][c] = arr[idx];
            idx++;
        }
        for (int r = rmax - 1; r >= rmin; r--) {
            mat[r][cmax] = arr[idx];
            idx++;
        }
        for (int c = cmax - 1; c >= cmin + 1; c--) {
            mat[rmin][c] = arr[idx];
            idx++;
        }
    }

    public static void ringrotate(int[][] mat, int s, int r) {
        // fill 1d
        int[] arr = fill1d(mat, s);
        // rotate
        rotate(arr, r);
        // fill 2d
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
