import java.util.Scanner;

public class n_Queens {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        printNQueens(new int[n][n], "", 0);
    }
    public static boolean issafe(int[][] chess, int row, int col){
        //upwards
        for(int i=row-1, j=col; i>=0; i--){
            if(chess[i][j]==1){
                return false;
            }
        }
        // left diognal
        for(int i=row-1, j=col-1; i>=0 && j>=0; i-- , j--){
            if(chess[i][j]==1){
                return false;
            }
        }
        // right diagnal
        for(int i=row-1, j=col+1; i>=0 && j<=chess[0].length-1; i--, j++){
            if(chess[i][j]==1){
                return false;
            }
        }
        return true; 
    }
    public static void printNQueens(int[][] chess, String asf, int row) {
        if(row==chess.length){
            System.out.println(asf+".");
            return;
        }
        for(int c=0; c<chess[0].length; c++){
            if(issafe(chess,row,c)){
                chess[row][c]=1;
                printNQueens(chess, asf+row+"-"+c+",", row+1);
                chess[row][c]=0;
            }
        }
    }
}
