import java.util.Scanner;
public class PrintStairPath {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
    }

    public static void printStairPaths(int qsf, String asf) {
        if(qsf==0){
            System.out.println(asf);
            return;
        }
        if(qsf>=1){
            printStairPaths(qsf-1, asf+1);
        }
        if(qsf>=2){
            printStairPaths(qsf-2, asf+1);
        }
        if(qsf>=3){
            printStairPaths(qsf-3, asf+3);
        }
    }
}
