//1. Converting Excel Column Title to Number:


public class excel {
    public static void main(String[] args) {
        String s = "xfd";
        int count =0;

        for(int i=0;i<s.length();i++){
            count*=26;
            System.out.println("count1: "+count);
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z'){
                int n = (int)ch-32;
                System.out.println("n: "+n);
                ch=(char)n;
                System.out.println("ch: "+ch);
            }
            
            int n1 =ch-'A'+1;
            System.out.println("n1: "+n1);
            
            count+=n1;
            System.out.println("count: "+count);
        }
        System.out.println(count);
    }
}
