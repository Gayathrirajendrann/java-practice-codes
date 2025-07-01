import java.util.*;


public class linkedhashmap {
    
    
        public static void main(String[] args){
            Map<Character,Integer> charcount = new LinkedHashMap<>();
            String str = "javaforjava";
            for(char ch:str.toCharArray()){
                if(charcount.containsKey(ch)){
                    charcount.put(ch,charcount.get(ch)+1);
            }else {
                charcount.put(ch,1);
            }
        }
       for(Map.Entry<Character,Integer> entry:charcount.entrySet()){
          if(entry.getValue()==1){
               System.out.println(entry.getKey());
               break;
           }
       }
    }
}
