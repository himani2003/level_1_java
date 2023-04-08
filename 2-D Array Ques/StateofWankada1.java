// 1. He first travels southwards till no further south places are available.
// 2. He then moves only 1 place eastwards.
// 3. He starts to move again towards north till any further north moves are available. 
// This continues till all the places are covered. 

// For example, the monuments are named as follows:
// 1  2  3
// 4  5  6
// 7  8  9

// Path followed by traveler: 1->4->7->8->5->2->3->6->9

import java.util.Scanner;
public class StateofWankada1 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int nr=scn.nextInt();
        int nc=scn.nextInt();
        int[][] mat=new int[nr][nc];
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                mat[i][j]=scn.nextInt();
            }
        }
        move(mat);
    }

    public static void move(int[][] mat){
        int nr=mat.length, nc=mat[0].length;
        for(int i=0; i<nc; i++){
            if(i%2==0){
                //top to bottom
                for(int j=0; j<nr; j++){
                    System.out.println(mat[j][i]);
                }
            }
            else{
                //bottom to top
                for(int j=nr-1; j>=0; j--){
                    System.out.println(mat[j][i]);
                }
            }
        }
    }
}
