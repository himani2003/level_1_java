public class count_binary_str {
    public static void main(String[] args) {
        System.out.println(count(0,"",6));
        System.out.println(count_binary_string_dp(6));
    }
    public static int count(int curr, String ans, int n){
        if(curr==n){
            return 1;
        }
        if(curr>0 && ans.charAt(curr-1)=='0' ){
            int sum=count(curr+1, ans+"1", n);
            return sum;
        }else{
            int a1=count(curr+1, ans+"1", n);
            int a2=count(curr+1, ans+"0", n);
            return a1+a2;
        }
    }
    public static int count_binary_string_dp(int n){
        int [][] mem=new int[2][n+1];
        int nr=mem.length, nc=mem[0].length;
        for(int c=0; c<nc; c++){
            for(int r=0; r<nr; r++){
                if(c==0){
                    mem[r][c]=0;
                }else if(c==1){
                    mem[r][c]=1;
                }else{
                    if(r==0){
                        mem[r][c]=mem[r+1][c-1];
                    }else{
                        mem[r][c]=mem[r][c-1]+mem[r-1][c-1];
                    }
                }
            }
        }
        return mem[0][nc-1]+mem[1][nc-1];
    }
}
