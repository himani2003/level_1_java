import java.util.Scanner;

// 1. You are given a positive number n. 
// 2. You are required to print the counting from n to 1.
// 3. You are required to not use any loops. Complete the body of print Decreasing function to achieve it.

// 1. You are given a positive number n. 
// 2. You are required to print the counting from 1 to n.
// 3. You are required to not use any loops. Complete the body of print Increasing function to achieve it. Don't change the signature of the function.

// 1. You are given a positive number n. 
// 2. You are required to print the counting from n to 1 and back to n again.
// 3. You are required to not use any loops. Complete the body of pdi function to achieve it. Don't change the signature of the function.

public class Basics {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        // Increase(n);
        // Decrease(n);
        // ID(n);
        int num=factorial(n);
        System.out.println(num);
    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return factorial(n-1)*n;
    }
    public static void Increase(int n){
        if(n==0){
            return;
        }
        Increase(n-1);
        System.out.println(n);
    }
    public static void Decrease(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        Decrease(n-1);
    }
    public static void ID(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        ID(n-1);
        System.out.println(n);
    }
}
