public class OptiLongestCommonPrefix {

    public static String longestcommonprefix(String[] strs) {
        
        if (strs == null || strs.length == 0) {
            return "";
        }

        
        String pref = strs[0];

        
        for (int i = 1; i < strs.length; i++) {
            
            while (!strs[i].startsWith(pref)) {
                
                pref = pref.substring(0, pref.length() - 1);

                
                if (pref.isEmpty()) {
                    return "";
                }
                
                System.out.println("Current prefix: " + pref);
            }
            
            System.out.println("Loop terminates for string: " + strs[i]);
        }

        
        return pref;
    }

    public static void main(String[] args) {
        
        String[] test1 = {"flower", "flow", "flight"};
       

        System.out.println("Longest Common Prefix: " + longestcommonprefix(test1)); 
       
    }
}