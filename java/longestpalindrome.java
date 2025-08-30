public class longestpalindrome {
    public static void main(String[] args) {
        String str = "cbbbdd";
        int n = str.length();
        String longestPalindrome = "";

        for (int i = 0; i < n; i++) {
            int L = i;
            int R = n - 1;

            while (L < R) {
                if (str.charAt(L) == str.charAt(R)) {
                    int start = L, end = R;
                    while (start <= end && str.charAt(start) == str.charAt(end)) {
                        start++;
                        end--;
                    }
                    if (start > end) { 
                        String palindrome = str.substring(L, R + 1);
                        if (palindrome.length() > longestPalindrome.length()) {
                            longestPalindrome = palindrome;
                        }
                    }
                }
                R--; 
               }
           }
           System.out.println("Longest Palindromic Substring: " + longestPalindrome);
    }
}
