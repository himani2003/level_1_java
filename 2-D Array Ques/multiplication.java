import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int m1 = scn.nextInt();
        int[][] mat1 = new int[n1][m1];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                mat1[i][j] = scn.nextInt();
            }
        }
        int n2 = scn.nextInt();
        int m2 = scn.nextInt();
        int[][] mat2 = new int[n2][m2];
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[0].length; j++) {
                mat2[i][j] = scn.nextInt();
            }
        }
        multiply(mat1, mat2);
    }

    public static void multiply(int[][] mat1, int[][] mat2){
        int nc1=mat1[0].length, nr2=mat2.length;
        int[][] ans=new int[nc1][nr2];
        for(int i=0; i<nc1; i++){
            for(int j=0; j<nr2; j++){
                int ele=0;
                for(int k=0; k<mat1.length; k++){
                    ele=ele+(mat1[i][k]*mat2[k][j]);
                }
                System.out.println(ans[i][j]=ele);
            }
        }
    }
}
