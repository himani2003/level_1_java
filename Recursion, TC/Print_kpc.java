public class Print_kpc {
    public static void main(String[] args) {
        printkpc("123","");
    }
    static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printkpc(String qsf, String asf){
        if(qsf.length()==0){
            System.out.println(asf);
            return;
        }
        char ch=qsf.charAt(0);
        String roq=qsf.substring(1);
        String s=codes[ch-'0'];
        for(int i=0; i<s.length(); i++){
            printkpc(roq, asf+s.substring(i,i+1));
        }
    }
}
