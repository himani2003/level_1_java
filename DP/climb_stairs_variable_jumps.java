import java.util.Arrays;
import java.util.Scanner;
public class climb_stairs_variable_jumps {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] moves=new int[n];
        for(int i=0; i<n; i++){
            moves[i]=scn.nextInt();
        }
        int[] mem=new int[n+1];
        Arrays.fill(mem,-1);
        System.out.println(climbstairsvariablejump_rec(0, n, moves));
    }

    public static int climbstairsvariablejump_rec(int currStep, int totalstep, int[] moves){
        if(currStep==totalstep){
            return 1;
        }
        if(currStep>totalstep){
            return 0;
        }
        int sum=0;
        for(int i=1; i<=moves[currStep]; i++){
            sum+=climbstairsvariablejump_rec(currStep+i, totalstep, moves);
        }
        return sum;
    }
    public static int climbstairsvariablejump_mem(int currStep, int totalstep, int[] moves, int[] mem){
        if(currStep==totalstep){
            return mem[currStep]=1;
        }
        if(currStep>totalstep){
            return mem[currStep]=0;
        }
        if(mem[currStep]!=-1){
            return mem[currStep];
        }
        int sum=0;
        for(int i=1; i<=moves[currStep]; i++){
            sum+=climbstairsvariablejump_rec(currStep+i, totalstep, moves);
        }
        return mem[currStep]=sum;
    }
    // public static int climbstairsvariablejump_tab(int[] move){

    // }
}