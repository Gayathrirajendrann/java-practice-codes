public class substring {
    public static void main(String[] args) {
        String s = "abc"; 
        int n = s.length();

        for (int i = 0; i < n; i++) { 
            String current = "";
            for (int j = i; j < n; j++) { 
                current += s.charAt(j); 
                System.out.print(current + " "); 
            }
        }
    }
}
