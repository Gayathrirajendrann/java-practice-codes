public class FindIndexSubString {
        public static void main(String[] args) {
            String haystack = "satbutsad";
            String needle = "sad";
    
            int index = findFirstOccurrence(haystack, needle);
            System.out.println(index);
        }
    
        public static int findFirstOccurrence(String haystack, String needle) {
            if (needle.length() == 0) return 0; 
            if (haystack.length() < needle.length()) return -1; 
            for (int i = 0; i <= haystack.length(); i++) {
                boolean found = true;
                for (int j = 0; j < needle.length(); j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        found = false;
                        break;
                    }
                }
                if (found) return i; 
            }
    
            return -1; 
        }
    }

