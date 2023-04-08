
// 4. You are required to find x in the matrix and print it's location int (row, col) format as discussed in output format below.
// 5. In case element is not found, print "Not Found".
import java.util.Scanner;

public class Search2DsortedArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] mat = new int[n][n];
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                mat[row][col] = scn.nextInt();
            }
        }
        int d = scn.nextInt();
        find(mat, n, d);
    }

    public static void find(int[][] mat, int n, int d) {
        int cmax = mat.length - 1;
        for (int r = 0; r < n; r++) {
            if(mat[r][cmax]>=d){
                for(int c=0; c<n; c++){
                    if(mat[r][c]==d){
                        System.out.println(r);
                        System.out.println(c);
                        return;
                    }
                }
            }
        }
        System.out.println("Not found");
    }
}
