public class maxstring {

    public static void main(String[] args){
        String[] strs = {"flower", "flow", "fly"};
        
        
        if (strs == null || strs.length == 0) {
            System.out.println("invalid");
        }

        
        String s1 = strs[0];
        int max= s1.length();
        
        int index =0;
        for (int i = 1; i < strs.length-1; i++) {
              String s = strs[i];
              if(max<s.length()){
                max=s.length();
                s1=s;
              }
              if(max==s.length()){

              }

        }
        System.out.println(s1);   
   }
}