
public class excel {
    public static void main(String[] args) {
        String s = "XFD";
        int count =0;

        for(int i=0;i<s.length();i++){
            count*=26;
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z'){
                int n = (int)ch-32;
                ch=(char)n;
            }
            
            int n1 =ch-'A'+1;
            
            count+=n1;
        }
        System.out.println(count);
    }
}
