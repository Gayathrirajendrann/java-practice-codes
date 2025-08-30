public class characterReplacement {

    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        int max=0;
        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            if (ch1 == 'A') {
                StringBuilder str = new StringBuilder(s);
                
                int replacements = 0;
                int L = i;
                while (replacements != k && L < s.length()) {
                    char ch2 = str.charAt(L);
                    if (ch2 == 'A') {
                        str.setCharAt(L, 'B'); 
                        replacements++;
                        if (replacements == k) {
                            break;
                        }
                    }
                    L++;
                }

                
                int[] freq = new int[2]; 
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == 'A') {
                        freq[0]++;
                    } else if (str.charAt(j) == 'B') {
                        freq[1]++;
                    }
                }

                int maxCount = Math.max(freq[0], freq[1]);
                if(max<maxCount){
                    max=maxCount;
                }
            }
        }
        System.out.println( max);
    }
}
