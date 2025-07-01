public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String s = "aabbcc";
        int n = s.length();
        char c = ' ';
        boolean found = false;

        for (int i = 0; i < n; i++) {
            int count = 0;
            
           
            for (int j = 0; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }

            
            if (count == 1) {
                c = s.charAt(i);
                found = true;
                break; 
            }
        }

        if (found) {
            System.out.println(c);
        } else {
            System.out.println(-1);
        }
    }
}
