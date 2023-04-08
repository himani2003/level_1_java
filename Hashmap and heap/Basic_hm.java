import java.util.HashMap;

public class Basic_hm {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        System.out.println(hm);
        //add an element
        hm.put("India",200);
        System.out.println(hm);
        hm.put("USA",100);
        System.out.println(hm);
        hm.put("Canada",500);
        System.out.println(hm);
        hm.put("China",200);
        System.out.println(hm);

        //update an element
        hm.put("India",205);
        System.out.println(hm);

        //key exists
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("india"));

        //get a Value
        System.out.println(hm.get("India"));
        System.out.println(hm.get("india")); 

        //remove a key,value
        System.out.println(hm.remove("India")+"->"+hm);
        System.out.println(hm.remove("India")+"->"+hm);

        //size
        System.out.println(hm.size());

        //keySet
        for(String key:hm.keySet()){
            System.out.println(key+" "+hm.get(key));
        }
    }
}
