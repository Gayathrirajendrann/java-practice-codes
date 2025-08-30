import java.util.HashMap;
import java.util.Map.Entry;

public class hashmap {
    public static void main(String[] args){
         HashMap<String, Integer> hashMap = new HashMap<>();
         hashMap.put("John", 25);
         hashMap.put("Jane", 30);
         hashMap.put("Jim", 35);
         System.out.println(hashMap);

         for(Entry<String, Integer> e: hashMap.entrySet()){
                   System.out.println("key :"+e.getKey()+"-->"+"value :"+e.getValue());
         }
         HashMap map = new HashMap<>();
         map = (HashMap)hashMap.clone();
         System.out.println(map);
    }
}
