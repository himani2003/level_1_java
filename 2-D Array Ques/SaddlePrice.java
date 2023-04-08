// 3. The saddle price is defined as the least price in the row but the maximum price in the column of the matrix.

import java.util.Scanner;
public class SaddlePrice {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[][] mat=new int[n][n];
        for(int row=0; row<n; row++){
            for(int col=0; col<n; col++){
                mat[row][col]=scn.nextInt();
            }
        }
        for(int r=0; r<n; r++){
            int ele=mat[r][0];
            int ci=0;
            for(int c=0; c<n; c++){
                if(mat[r][c]<ele){
                    ele=mat[r][c];
                    ci=c;
                }
            }
            boolean ans=check(mat, ci, ele);
            if(ans== true){
                System.out.println(ele);
                return;
            }
        }
        System.out.println("Invalid input");
    }

    public static boolean check(int[][] mat, int ci, int ele){
        for(int i=0; i<mat.length; i++){
            if(mat[i][ci]>ele){
                return false;
            }
        }
        return true;
    }
}
