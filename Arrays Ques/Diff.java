import java.util.Scanner;
public class Diff {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int[] arr1=new int[n1];
        for(int i=0; i<arr1.length; i++){
            arr1[i]=scn.nextInt();
        }
        int n2=scn.nextInt();
        int[] arr2=new int[n2];
        for(int i=0; i<arr2.length; i++){
            arr2[i]=scn.nextInt();
        }
        int[] ans=diff(arr1, arr2);
        for(int val: ans){
            System.out.println(val);
        }
    }

    public static int[] diff(int[] arr1, int[] arr2){
        int n=Math.max(arr1.length, arr2.length);
        int[] res=new int[n];
        int p1=arr1.length-1, p2=arr2.length-1, p3=res.length-1;
        while(p1>=0 || p2>=0){
            int v1=p1>=0?arr1[p1]:0;
            int v2=p2>=0?arr2[p2]:0;
            int diff=v1-v2;
            if(diff<0){
                diff=diff+10;
                arr1[p1-1]--;
            }
            res[p3]=diff;
            p1--;
            p2--;
            p3--;
        }
        int k=0;
        for(int i=0; i<res.length; i++){
            if(res[i]!=0){
                break;
            }
            else{
                k++;
            }
        }
        int[] ans=new int[res.length-k];
        for(int i=0; i<ans.length; i++){
            ans[i]=res[i+k];
        }
        return ans;
    }
}
