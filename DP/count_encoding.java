public class count_encoding {
    public static void main(String[] args) {
        System.out.println(count_enc("0132"));
    }
    public static int count_enc(String qsf){
        int n=qsf.length();
        int[] mem=new int[n+1];
        for(int i=mem.length-1; i>=0; i--){
            char ch=qsf.charAt(i);
            if(ch=='0'){
                mem[i]=0;
            }
            if(i==mem.length-1){
                mem[i]=1;
            }else if(i==mem.length-2){
                mem[i]=mem[i+1];
            }else{
                mem[i]=mem[i+1]+mem[i+2];
            }
        }
        return mem[0];
    }
}
