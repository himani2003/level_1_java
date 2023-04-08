// 3. You are required to rotate the matrix by 90 degree clockwise and then display the contents using display function.
import java.util.Scanner;
public class Rotateby90 {
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
        int[][] ans=new int[nr][nc];
        for(int col=0; col<nc; col++){
            int k=0;
            for(int row=nr-1; row>=0; row--){
                ans[col][k]=mat[row][col];
                k++;
            }
        }
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans[0].length; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
