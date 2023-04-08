// 1. The visitor only plans to visit the upper diagonal triangle of the monument list.
// 2. The visitor travels diagonally till there are no more moves left in the current journey. 
// 3. He then visits the adjacent monument to the first monument of current diagonal journey. 
// 4. He continues the same path till all the monuments of the upper half have been travelled.
// For Example:
// The monuments are named as:
// 1    2    3    4
// 5    6    7    8
// 9   10  11  12
// 13 14  15  16
// The path followed by the visitor is: 1->6->11->16->2->7->12->3->8->4

import java.util.Scanner;
public class StateofWankada2 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        // int nc=scn.nextInt();
        int[][] mat=new int[n][n];
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                mat[i][j]=scn.nextInt();
            }
        }
        move(mat,n);
    }

    public static void move(int[][] mat, int n){
        for(int c=0; c<n; c++){
            int col=c;
            int row=0;
            while(row<n){
                System.out.println(mat[row][col]);
                row++;
                col++;
            }
        }   
    }
}
