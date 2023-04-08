// 1. You are given an ArrayList of positive integers. 
// 2. You have to remove prime numbers from the given ArrayList and return the updated ArrayList. 
// Note -> The order of elements should remain same.

import java.util.ArrayList;
import java.util.Scanner;
public class RemovePrimes {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0; i<n; i++){
            list.add(scn.nextInt());
        }
        for(int i=n-1; i>=0; i--){
            if(prime(list.get(i))){
                list.remove(i);
            }
        }
        for(int val:list){
            System.out.println(val);
        }
    }
    public static boolean prime(int n){
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
