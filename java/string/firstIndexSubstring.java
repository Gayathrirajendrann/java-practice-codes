public class firstIndexSubstring {
        public int strStr(String haystack, String needle) {
            if (needle == null || needle.isEmpty()) {
                return 0;
            }
            if (haystack == null || haystack.length() < needle.length()) {
                return -1;
            }
            for (int i = 0; i <= haystack.length() - needle.length(); i++) {
                if (haystack.substring(i, i + needle.length()).equals(needle)) {
                    return i;
                }
            }
            return -1;
        }

    public static void main(String[] args){
        firstIndexSubstring obj =new firstIndexSubstring();
        int result = obj.strStr("sadbadsad","sad");
        System.out.println(result);
    }
}   

