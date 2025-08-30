public class Anagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a'] += 1;
        }
        // for (int i = 0; i < 26; i++) {
        //     System.out.println("Char of : " + (char) (97 + i) + "  " + count[i]);
        // }
        // System.out.println("---------------------------");
        for (int i = 0; i < t.length(); i++) {
             if (count[t.charAt(i) - 'a'] == 0) {
                 return false;
             }
            count[t.charAt(i) - 'a'] -= 1;
        }
        
        for (int i = 0; i < 26; i++) {
            System.out.println("Char of : " + (char) (97 + i) + "  " + count[i]);
        }
        return true;
    }

    public static void main(String args[]) {
        String str1 = "and";
        String str2 = "dna";
        boolean result = isAnagram(str1, str2);
        System.out.println(result);
    }
}
//[1,0,0,1,0,0,1.......]    a-a  =0 