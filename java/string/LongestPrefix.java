import java.util.Scanner;

public class LongestPrefix {
    public void commonPrefix(String s1, String s2, String s3) {
        String prefix = "";

        
        int minLength = s1.length();
        if (s2.length() < minLength) {
            minLength = s2.length();
        }
        if (s3.length() < minLength) {
            minLength = s3.length();
        }
       
        
        for (int i = 0; i < minLength; i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            char ch3 = s3.charAt(i);
             System.out.println(ch1);
             System.out.println(ch2);
             System.out.println(ch2);
            if (ch1 == ch2 && ch2 == ch3) {
                prefix += ch1;
            } else {
                break;
            }
        }

        if (!prefix.isEmpty()) {
            System.out.println("Longest Common Prefix: " + prefix);
        } else {
            System.out.println("No common prefix");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();

        LongestPrefix obj = new LongestPrefix();
        obj.commonPrefix(s1, s2, s3);
    }
}
